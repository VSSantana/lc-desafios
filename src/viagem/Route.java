package viagem;

public class Route {

    private Integer originNodeIndex;
    private String origin;
    private String destiny;

    public Route(String origin, String destiny) {

        setOrigin(origin);
        setDestiny(destiny);

    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public Integer getOriginNodeIndex() {
        return originNodeIndex;
    }

    public void setOriginNodeIndex(Integer originNodeIndex) {
        this.originNodeIndex = originNodeIndex;
    }

}
