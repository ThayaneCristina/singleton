public class gerenciadorParceiro {
    private gerenciadorParceiro() {};
    private static gerenciadorParceiro instance = new gerenciadorParceiro();
    public static gerenciadorParceiro getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String cnpjEmpresa;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getcnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setcnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }
}
