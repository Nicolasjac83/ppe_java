module com.example.hsp_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;
    requires java.sql;
    requires javax.mail.api;
    requires eu.hansolo.fx.countries;
    requires eu.hansolo.fx.heatmap;
    requires eu.hansolo.toolboxfx;
    requires eu.hansolo.toolbox;
    requires javafx.swing;

    opens com.example.hsp_java to javafx.fxml;
    exports com.example.hsp_java;
    exports connexion;
    opens connexion to javafx.fxml;
    exports application;
    opens application to javafx.fxml;
    exports mdp;
    opens mdp to javafx.fxml;
    exports inscription;
    opens inscription to javafx.fxml;
    exports secretaire;
    opens secretaire to javafx.fxml;

    // Exportez le package medecin à javafx.graphics et à javafx.fxml
    opens medecin to javafx.fxml;
    exports medecin to javafx.graphics;
    opens medoc_stock to javafx.fxml;
    exports medoc_stock to javafx.graphics;
    opens patient to javafx.fxml;
    exports patient to javafx.graphics;
    opens rendez_vous to javafx.fxml;
    exports rendez_vous to javafx.graphics;
    opens fournisseur to javafx.fxml;
    exports fournisseur to javafx.graphics;
    opens hospitalisation to javafx.fxml;
    exports hospitalisation to javafx.graphics;
    exports admin;
    opens admin to javafx.fxml;
    opens administrateur to javafx.fxml;
    exports administrateur to javafx.graphics;
}


