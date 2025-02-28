import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*
    list1 = 1 5; list2 = 3 2
    current = dummy = ListNode( val = -1)

    each list will be sorted at Collections.sort(sortedValues);
    list1 = 1 5; list2 = 2 3


    First
        list1.value =  1 <= list2.value = 2? True
    Then
        current.next = list1 =  (val = 1)
        list1 =  list1.next = 5

        current.next(list1(val = 5); list2(val = 2))

    Second
        list1.value =  5 <= list2.value = 2? False
    Then
        current.next = list2 =  (val = 2)
        list2 =  list2.next = 3

    Third
        list1.value =  5 <= list2.value = 3? False
    Then
        current.next = list2 =  (val = 3)
        list2 =  list2.next = null

 */



public class MergeSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode createListFromInput(Scanner scanner) {
        System.out.println("Enter numbers for the list, separated by space:");
        String[] values = scanner.nextLine().split(" ");
        List<Integer> sortedValues = new ArrayList<>();

        for (String val : values) {
            sortedValues.add(Integer.parseInt(val));
        }

        Collections.sort(sortedValues);

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int val : sortedValues) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input for first list:");
        ListNode list1 = createListFromInput(scanner);

        System.out.println("Input for second list:");
        ListNode list2 = createListFromInput(scanner);

        ListNode mergedList = mergeTwoLists(list1, list2);
        printList(mergedList);

        scanner.close();
    }
}