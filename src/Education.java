public class Education{
    private double noHighSchool;
    private double onlyHighSchool;
    private double someCollege;
    private double bachelorOrMore;

    public Education(double noHighSchool, double onlyHighSchool, double someCollege, double bachelorOrMore) {
        this.noHighSchool = noHighSchool;
        this.onlyHighSchool = onlyHighSchool;
        this.someCollege = someCollege;
        this.bachelorOrMore = bachelorOrMore;
    }

    public double getNoHighSchool() {
        return noHighSchool;
    }

    public void setNoHighSchool(double noHighSchool) {
        this.noHighSchool = noHighSchool;
    }

    public double getOnlyHighSchool() {
        return onlyHighSchool;
    }

    public void setOnlyHighSchool(double onlyHighSchool) {
        this.onlyHighSchool = onlyHighSchool;
    }

    public double getSomeCollege() {
        return someCollege;
    }

    public void setSomeCollege(double someCollege) {
        this.someCollege = someCollege;
    }

    public double getBachelorOrMore() {
        return bachelorOrMore;
    }

    public void setBachelorOrMore(double bachelorOrMore) {
        this.bachelorOrMore = bachelorOrMore;
    }
}
