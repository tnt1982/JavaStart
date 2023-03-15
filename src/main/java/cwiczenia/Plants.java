package cwiczenia;

public class Plants {

    public static void main(String[] args) {

        Plant plant1 = new Plant();
        Plant plant2 = new Plant();
        Plant plant3 = new Plant();

        plant1.name = "jabłoń";
        plant1.description = "duże drzewo liściaste";
        plant1.waterDemand = 1.0;

        plant2.name = "grusza";
        plant2.description = "średnie drzewo liściaste";
        plant2.waterDemand = 0.7;

        plant3.name = "śliwka";
        plant3.description = "małe drzewo liściaste";
        plant3.waterDemand = 0.5;

        double dailyWaterDemand = plant1.waterDemand + plant2.waterDemand + plant3.waterDemand;
        double weeklyWaterDemand = dailyWaterDemand * 7;
        double annualWaterDemand = dailyWaterDemand * 365;

        System.out.println("Dzienne zużycie wody przez wszystkie rośliny: " + dailyWaterDemand);
        System.out.println("Tygodniowe zużycie wody przez wszystkie rośliny: " + weeklyWaterDemand);
        System.out.println("Roczne zużycie wody przez wszystkie rośliny: " + annualWaterDemand);
    }
}

