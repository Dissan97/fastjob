module com.agnese_dissan.fastjob {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens com.agnese_dissan.fastjob to javafx.fxml;
    exports com.agnese_dissan.fastjob;
    exports com.agnese_dissan.fastjob.views;
    opens com.agnese_dissan.fastjob.views to javafx.fxml;
}