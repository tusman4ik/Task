package Manager;

import Logic.BoxLoading.LoadManader;
import Logic.Preparations.PackingManager;
import Modules.Objects.Obj;
import Output.*;

import java.util.ArrayList;

public class MainManager {
    public static void main(String[] args) {
        PackingManager.firtStep("C:\\Users\\Oleg\\Documents\\AllForJava\\data.txt");


        LoadManader.secondStep();
        Logic.BoxPacking.PackingManager.thirdStep();
        Output.printJson();
        PrinterNotPlaced.print();
        Information.print();
    }

}
