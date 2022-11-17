package Singleton;

import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> list) {

        Logger logger = Logger.getInstance();
        List<Integer> result = list.stream()
                .filter(i -> {
                    if (i < threshold) {
                        logger.log("element:" + i + " pass");
                    } else {
                        logger.log("element:" + i + " not pass");
                    }
                    return i < threshold;
                }).toList();
        logger.log("pass filter:" + result.size() + " element from:" + list.size());
        return result;
    }
}