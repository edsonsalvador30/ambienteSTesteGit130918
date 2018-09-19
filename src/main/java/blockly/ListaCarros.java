package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ListaCarros {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// ListaCarros
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var banco = Var.VAR_NULL;
			private Var lista = Var.VAR_NULL;

			public Var call() throws Exception {
				banco = cronapi.database.Operations.query(Var.valueOf("app.entity.Carro"),
						Var.valueOf("select c from Carro c"));
				while (cronapi.database.Operations.hasElement(banco).getObjectAsBoolean()) {
					lista = cronapi.database.Operations.query(Var.valueOf("app.entity.Carro"),
							Var.valueOf("select c.empresa from Carro c"));
					System.out.println(lista.getObjectAsString());
					cronapi.database.Operations.next(banco);
				} // end while
				return Var.VAR_NULL;
			}
		}.call();
	}

}
