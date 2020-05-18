import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> list = List.of(1.0, 2.0, 3.0);

        try {
            System.out.println(average(list));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double median(List<Double> list){
        
        return 2.0;
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
