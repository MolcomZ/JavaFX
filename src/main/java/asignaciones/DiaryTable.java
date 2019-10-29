package asignaciones;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DiaryTable {
    private ObservableList<IdNamePair> pairList;
    private Integer rows;
    private Integer columns;

    public DiaryTable(){
        pairList=FXCollections.observableArrayList();
    }
    
}
