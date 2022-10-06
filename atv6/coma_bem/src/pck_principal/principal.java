package pck_principal;

public class principal {
    public static void main(Sring[] args) {
       /* DAO_Produtos obj_produtos = new DAO_Produtos();
        */

        //consultar produtos
        /*obj_produtos.consultar();
         */

        //adicionar produtos
       /* Produto novoProduto = new Produto(6, "caminhão",100000.00,1,2);
        obj_produtos.inserir(novoProduto);
        */

        //alterar produtos
       /* Produto produtoAlterado = new Produto(6, "chocolate",10.00,1,3);
        obj_produtos.alterar(produtoAlterado);
        */


        //excluir produtos
       /* obj_produtos.excluir(6);
        */

        DAO_Unidades obj_unidades = new DAO_Unidades();

        //consultar unidades
       /* obj_unidades.consultar();
        */

        //inserir unidades
        /*Unidade novaUnidade = new Unidade(7, "tonelada");
        obj_unidades.inserir(novaUnidade);
         */

        //alterar unidade
        /*Unidade unidadeAlterada = new Unidade(7, "polegada");
        obj_unidades.alterar(unidadeAlterada);
         */

        //excluir unidade
        obj_unidades.excluir(7);



    }
}
