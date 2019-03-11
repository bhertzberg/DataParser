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

    public class Election{
        private double demVotes;
        private double gopVotes;
        private double totalVotes;
    }

    public class Education{
        private double noHighSchool;
        private double onlyHighSchool;
        private double someCollege;
        private double bachelorOrMore;
    }

    public class Employment{
        private int totalLaborForce;
        private int employedLaborForce;
        private int unemployedLaborForce;
        private double unemployedPercent;
    }
}
