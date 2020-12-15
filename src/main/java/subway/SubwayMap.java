package subway;

import subway.domain.LineRepository;
import subway.domain.StationRepository;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.Scanner;

public class SubwayMap {

    private Scanner scanner;
    private LineRepository lineRepository;
    private StationRepository stationRepository;

    public SubwayMap(Scanner scanner) {
        this.scanner = scanner;
        lineRepository = new LineRepository();
        stationRepository = new StationRepository();
        startService();
    }

    private void startService() {
        selectService();
    }

    private void selectService() {
        OutputView.printMainView();
        String inputData = InputView.inputMainMenu(scanner);
    }


}
