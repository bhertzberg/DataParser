public class County {
    private String name;
    private int fips;
    private Election vote;
    private Education educ;
    private Employment employ;

    public County(String name, int fips, Election vote, Education educ, Employment employ) {
        this.name = name;
        this.fips = fips;
        this.vote = vote;
        this.educ = educ;
        this.employ = employ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFips() {
        return fips;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }

    public Election getVote() {
        return vote;
    }

    public void setVote(Election vote) {
        this.vote = vote;
    }

    public Education getEduc() {
        return educ;
    }

    public void setEduc(Education educ) {
        this.educ = educ;
    }

    public Employment getEmploy() {
        return employ;
    }

    public void setEmploy(Employment employ) {
        this.employ = employ;
    }
}