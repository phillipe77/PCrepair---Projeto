package projeto7;

import javafx.application.Application;
import javafx.event.ActionEvent;

import java.awt.*;


public class PerfilClienteController {


    public void tecnicoButton(ActionEvent actionEvent) {
        Label tecnicoButton = new Label();
        tecnicoButton.setText("PROCURAR UM TECNICO");
        tecnicoButton.setBackground(Color.GREEN);
    }

    public void servicoButton(ActionEvent actionEvent) {
        Label servicoAberto = new Label();
        servicoAberto.setText("SERVIÇOS EM ABERTO");
        servicoAberto.setBackground(Color.BLUE);
    }

    public void servicoFinalizado(ActionEvent actionEvent) {
        Label servicoFinalizado = new Label();
        servicoFinalizado.setText("SERVIÇOS FINALIZADOS");
        servicoFinalizado.setBackground(Color.DARK_GRAY);

    }
}
