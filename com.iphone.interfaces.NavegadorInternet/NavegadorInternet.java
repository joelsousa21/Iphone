public interface NavegadorInternet {
    void abrirURL(String url);
    void fecharURL();
    void navegarPaginaAnterior();
    void navegarPaginaSeguinte();
    void realizarPesquisa(String termo);
}
    @Override
    public void abrirURL(String url) {
        System.out.println("Abrindo URL: " + url);
        currentURL = url;
        browserHistory[browserHistoryIndex] = url;
        browserHistoryIndex++;
    }

    @Override
    public void fecharURL() {
        System.out.println("Fechando URL: " + currentURL);
        currentURL = "";
    }

    @Override
    public void navegarPaginaAnterior() {
        if (browserHistoryIndex > 1) {
            browserHistoryIndex--;
            String previousURL = browserHistory[browserHistoryIndex - 1];
            System.out.println("Navegando para a página anterior: " + previousURL);
            currentURL = previousURL;
        }
    }

    @Override
    public void navegarPaginaSeguinte() {
        if (browserHistoryIndex < 10 && browserHistory[browserHistoryIndex] != null) {
            String nextURL = browserHistory[browserHistoryIndex];
            browserHistoryIndex++;
            System.out.println("Navegando para a próxima página: " + nextURL);
            currentURL = nextURL;
        }
    }

    @Override
    public void realizarPesquisa(String termo) {
        System.out.println("Realizando pesquisa na web: " + termo);
        // Implementação da pesquisa na web
    }
}