package viagem;

public class Edge {

    private Integer sourceNodeIndex;
    private Integer destinationNodeIndex;
    private String source;
    private String destination;

    public Edge(String source, Integer sourceNodeIndex, String destination, Integer destinationNodeIndex) {
        this.source = source;
        this.destination = destination;
        this.sourceNodeIndex = sourceNodeIndex;
        this.destinationNodeIndex = destinationNodeIndex;
    }

    public Integer getSourceNodeIndex() {
        return sourceNodeIndex;
    }

    public void setSourceNodeIndex(Integer sourceNodeIndex) {
        this.sourceNodeIndex = sourceNodeIndex;
    }

    public Integer getDestinationNodeIndex() {
        return destinationNodeIndex;
    }

    public void setDestinationNodeIndex(Integer destinationNodeIndex) {
        this.destinationNodeIndex = destinationNodeIndex;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}
