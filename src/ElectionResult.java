public class ElectionResult {
    double demVotes, gopVotes, totalVotes, demPercent, gopPercent, voteDifference, percentDifference;
    String stateAbbreviation, county, combinedFips;


    public ElectionResult(double demVotes, double gopVotes, double totalVotes, double demPercent, double gopPercent, double voteDifference, double percentDifference, String stateAbbreviation, String county, String combinedFips) {
        this.demVotes = demVotes;
        this.gopVotes = gopVotes;
        this.totalVotes = totalVotes;
        this.demPercent = demPercent;
        this.gopPercent = gopPercent;
        this.voteDifference = voteDifference;
        this.percentDifference = percentDifference;
        this.stateAbbreviation = stateAbbreviation;
        this.county = county;
        this.combinedFips = combinedFips;
    }

    public double getDemVotes() {
        return demVotes;
    }

    public void setDemVotes(double demVotes) {
        this.demVotes = demVotes;
    }

    public double getGopVotes() {
        return gopVotes;
    }

    public void setGopVotes(double gopVotes) {
        this.gopVotes = gopVotes;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(double totalVotes) {
        this.totalVotes = totalVotes;
    }

    public double getDemPercent() {
        return demPercent;
    }

    public void setDemPercent(double demPercent) {
        this.demPercent = demPercent;
    }

    public double getGopPercent() {
        return gopPercent;
    }

    public void setGopPercent(double gopPercent) {
        this.gopPercent = gopPercent;
    }

    public double getVoteDifference() {
        return voteDifference;
    }

    public void setVoteDifference(double voteDifference) {
        this.voteDifference = voteDifference;
    }

    public double getPercentDifference() {
        return percentDifference;
    }

    public void setPercentDifference(double percentDifference) {
        this.percentDifference = percentDifference;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCombinedFips() {
        return combinedFips;
    }

    public void setCombinedFips(String combinedFips) {
        this.combinedFips = combinedFips;
    }
}
