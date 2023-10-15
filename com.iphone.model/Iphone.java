public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String sistemaOperacional;
    private boolean isPlaying = false;
    private String currentTrack = "";
    private boolean isOnCall = false;
    private String callNumber = "";
    private String receivedCallFrom = "";
    private String messageBuffer = "";
    private String currentURL = "";
    private int browserHistoryIndex = 0;
    private String[] browserHistory = new String[10];

    public iPhone(String modelo, String sistemaOperacional) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }