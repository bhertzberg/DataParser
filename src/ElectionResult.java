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
}
