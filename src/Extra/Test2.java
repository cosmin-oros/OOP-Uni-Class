package Extra;

/*
    In a software application we have a queue structure that is used to store the work orders.
    A work order has a field that indicates the type of work that has to be done
    (this can have one of three possible values: Mechanical, Electrical and Body Painting) and
    another field that indicates the duration (in minutes) of the operation that has to be done.

    The work to be done at a certain moment, represented by the work orders queue,
    is considered balanced if the amount of the three different type of work is approximatively equal
    (+- an acceptable amount of time)

    Requirement
    Given the work order queue, represented as an array with work orders,
    write an algorithm that determines the minimum number of work orders that should be
    removed from the end of the queue so the work is balanced. If the work cannot be balanced, return -1.
 */

class WorkOrder {
    public String workType;
    public int duration;

    public WorkOrder(String workType, int duration) {
        this.duration = duration;
        this.workType = workType;
    }
}

public class Test2 {
    static int balanceQueue(WorkOrder workOrders[], int delta) {
        int diff = 0;
        int nrOfOrdersToRemove = 0;

        for (int i = 1; i < workOrders.length; i++) {
            diff += workOrders[i].duration;
        }

        int j = workOrders.length-1;

        while (diff > delta && j >= 0) {
            diff -= workOrders[j].duration;
            nrOfOrdersToRemove++;
            j--;
        }

        return nrOfOrdersToRemove != workOrders.length ? nrOfOrdersToRemove : -1;
    }

    public static void main(String[] args) {
        WorkOrder workOrder1 = new WorkOrder(" ", 3);
        WorkOrder workOrder2 = new WorkOrder(" ", 5);
        WorkOrder workOrder3 = new WorkOrder(" ", 4);
        WorkOrder[] workOrders = {workOrder1, workOrder2, workOrder3};

        System.out.println(balanceQueue(workOrders, 3));
    }
}
