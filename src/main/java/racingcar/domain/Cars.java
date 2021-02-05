package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;

    public Cars(Names names) {
        this.cars = generateCars(names);
    }

    private List<Car> generateCars(Names names) {
        return names.getNames().stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public String getCurrentPosition() {
        StringBuilder currentPosition = new StringBuilder();
        for (Car car : cars) {
            currentPosition.append(car.getCurrentPosition());
            currentPosition.append("\n");
        }
        return currentPosition.toString();
    }

    public Car getMaxPositionCar() {
        return cars.stream().max(Car::compareTo).get();
    }

    public List<Car> getWinnerCars(Car maxPositionCar) {
        return cars.stream().filter(car -> car.hasSamePositionWith(maxPositionCar)).collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return cars;
    }
}
