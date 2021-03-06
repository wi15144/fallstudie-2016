package version1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OpenKompetenzStage extends Stage {

	private Stage stage;
	private static int pid;

	public OpenKompetenzStage(int projektID, String projektName) throws Exception {
		stage = this;
		Parent root = FXMLLoader.load(getClass().getResource("Kompetenzen.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		pid = projektID;
		stage.setTitle(projektName);
		stage.show();
	}

	public static int getpid() {
		return pid;
	}

	public void setpid(int pid) {
		this.pid = pid;
	}

}
