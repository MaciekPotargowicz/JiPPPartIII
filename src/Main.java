import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> list = List.of(1.0, 2.0, 3.0);

        try {
            System.out.println(average(list));
            System.out.println(median(list));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double median(List<Double> list) {
        if (checkIsEven(list)) {
            return count(list);
        }
        return countCollect(list);
    }

    private static double countCollect(List<Double> list) {
        return list.get((list.size() + 1) / 2 - 1);
    }

    private static double count(List<Double> list) {
        return (list.get(list.size() / 2) + list.get((list.size() / 2) - 1)) / 2;
    }

    private static boolean checkIsEven(List<Double> list) {
        return list.size() % 2 == 0 ? true : false;
    }

    public static double average(List<Double> list) throws ArithmeticException {
        double temp = 0;
        if (list.isEmpty()) {
            throw new ArithmeticException("List can not be null");
        } else {
            for (Double number : list) {
                temp += number;
            }
        }
        return temp / list.size();
    }
}
