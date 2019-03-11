import java.util.List;

public class DataManager {
    private List<State> states;

    public class State {
        private String name;
        private List<County> counties;
    }

    private class County {
        private String name;
        private int fips;
        private Election vote;
        private Education educ;
        private Employment employ;
    }
}
