package pck_principal;

//importações
import java.sql.*;


public class DAO_Unidades {

    conexao obj_conexao = new Conexao();

    //metodo de consultar

    public void consultar(){
        obj_conexao.conexao();
        statement stm = null;
        ResultSet rs = null;

        try{
            stm = obj_conexao.conn.createStatement();
            rs = stm.executeQuery("select * from unidades");
            while(rs.next()){
                system.out.println(rs.getInt(1) +
                        " "+ rs.getString(2));

            }
            //desconexão
            obj_conexao.desconecta();
        }
//tratamento de erro
        catch(SQLException se){
            se.printStackTrace();

        }
    }

    //inserir unidades
    public void inserir(Unidade u){
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Unidades (cd_unidade, ds_unidade) VALUES (?,?)";
        try
        {
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1,u.getCd_unidade());
            pst.setString(2,u.getDs_unidade());
            pst.execute();
            obj_conexao.desconecta();
        }
        catch(SQLException se) {
            se.printStackTrace();
        }
    }

    //alterar unidades
    public void alterar(Unidade u){
        obj_conexao.conexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "UPDATE Unidades set ds_unidade=? WHERE cd_unidade=?";
        try
        {
            pst = obj_conexao.conn.prepareStatement(sql);

            pst.setString(1,u.getDs_unidade());
            pst.setInt(2,u.getCd_unidade());

            pst.execute();
            obj_conexao.desconecta();
        }
        catch(SQLException se) {
            se.printStackTrace();
        }
    }

    //excluir unidades
    public void excluir(int id){
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "DELETE from Unidades WHERE cd_unidade=?";
        try
        {
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1,id);

            pst.execute();
            obj_conexao.desconecta();
        }
        catch(SQLException se) {
            se.printStackTrace();
        }
    }



}
