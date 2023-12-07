
package mycompany.projetopoo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author debor
 */
public class Cliente {
    private Integer codCliente;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Date nascimento;
    private ArrayList<Item> items = new ArrayList<Item>();
}
