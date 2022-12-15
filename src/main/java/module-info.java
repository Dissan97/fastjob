module com.agnese_dissan.fastjob {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;
    requires org.slf4j;
    requires com.google.gson;


    opens com.agnese_dissan.fastjob to javafx.fxml;
    exports com.agnese_dissan.fastjob;
    exports com.agnese_dissan.fastjob.gui.views;
    opens com.agnese_dissan.fastjob.gui.views to javafx.fxml;
    exports com.agnese_dissan.fastjob.cli;
    opens com.agnese_dissan.fastjob.cli to javafx.fxml;
    exports com.agnese_dissan.fastjob.cli.views;
    opens com.agnese_dissan.fastjob.cli.views to javafx.fxml;
    exports com.agnese_dissan.fastjob.beans;
    opens com.agnese_dissan.fastjob.beans to javafx.fxml;
}