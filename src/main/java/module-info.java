module com.company.calc_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    exports Testes;


    opens com.company.calc_project to javafx.fxml;
    exports com.company.calc_project;
}