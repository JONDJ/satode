package fing.satode.ui.deposito.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;

import fing.satode.data.DepositoDTO;

public interface IDepositoAsync {

	void eliminarDeposito(DepositoDTO dto, AsyncCallback<Void> callback);

	void listaDepositos(AsyncCallback<ArrayList<DepositoDTO>> callback);

	void modificarDeposito(DepositoDTO dto, AsyncCallback<Void> callback);

	void nuevoDeposito(DepositoDTO dto, AsyncCallback<Void> callback);

}
