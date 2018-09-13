package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Block {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Block
	public static Var Execute() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(cronapi.util.Operations.getCurrentUserName().getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
