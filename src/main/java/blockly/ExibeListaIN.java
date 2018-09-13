package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ExibeListaIN {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// ExibeListaIN
	public static Var Execute() throws Exception {
		return new Callable<Var>() {

			private Var teste = Var.VAR_NULL;
			private Var item = Var.VAR_NULL;

			public Var call() throws Exception {
				teste = Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.Cidades")).toString()
						+ Var.valueOf(",").toString()
						+ cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.Cidades2")).toString());
				item = cronapi.database.Operations.query(Var.valueOf("app.entity.Cidade"),
						Var.valueOf("select c.name_city from Cidade c where c.name_city IN :name_city"),
						Var.valueOf("name_city", Var.valueOf("Campinas, Salvador")));
				System.out.println(teste.getObjectAsString());
				System.out.println(item.getObjectAsString());
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
						Var.valueOf("vars.textarea7566"), item);
				return Var.VAR_NULL;
			}
		}.call();
	}

}
