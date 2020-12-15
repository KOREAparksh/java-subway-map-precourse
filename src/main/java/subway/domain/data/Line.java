package subway.domain.data;

import java.util.List;
import java.util.Objects;

public class Line {
    private String name;
    private Station firstStation;
    private Station lastStation;
    private List<Station> stations;

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Station getFirstStation() {
        return firstStation;
    }

    public Station getLastStation() {
        return lastStation;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void addStation(Station station){

    }

    public boolean deleteSection(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    // 추가 기능 구현
}
