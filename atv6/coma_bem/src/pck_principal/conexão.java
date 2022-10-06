package pck_principal;

//importações
import java.sql.*;
import java.until.loggin.Level;
import java.until.loggin.Logger;


public class conexão {

    //variaveis
    private String caminho = "jdbc:mysql://localhost:3306/atv2";
    private String usuario = "root";
    private String senha = "senha_errada";
    public Connection conn;

   //estabelecendo a conexão
    public void conexao()
    {
        try
        {
        conn=DriverManager.getConnection(caminho,usuario,senha);
        System.out.println("CONECTADO COM SUCESSO")
        }

        //tratamento de erro
        catch(SQLException ex)
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
            system.out.println("ERRO DE CONEXAO");
        }
    }
    //desconexão
    public void desconecta(){

        try
        {
            conn.close;
            system.out.println("DESCONECTADO COM SUCESSO");
        }

        //tratamento de erro
        catch(SQLException ex)
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
            system.out.println("ERRO AO FECHAR CONEXAO");
        }



    }


    //teste
   /* public static void main(String[] args){
        Conexao obj_conexao = new Conexao();
        obj_conexao,conexao();
    }
   */
}
