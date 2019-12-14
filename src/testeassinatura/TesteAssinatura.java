package testeassinatura;

import jassinaturadigital.*;

public class TesteAssinatura {

    public static void main(String[] args) throws Exception {
        // Declaração de variáveis utilizadas como parâmetros pela função assinar da classe AssinarXML.
        final String localDocumentoXML = "src/arquivos/purchaseOrder.xml";
        final String localKeystoreXML = "src/arquivos/keystore";
        final String senhaKeystoreXML = "changeit";
        final String nomePrivateKeyXML = "mykey";
        final String senhaPrivateKeyXML = "changeit";
        
        // Chamada ao método para assinar
        AssinaturaXML signxml = new AssinaturaXML();
        //signxml.assinar(localDocumentoXML, localKeystoreXML, senhaKeystoreXML, nomePrivateKeyXML, senhaPrivateKeyXML);
        signxml.assinarTag(localDocumentoXML, localKeystoreXML, senhaKeystoreXML, nomePrivateKeyXML, senhaPrivateKeyXML, "Buyer");
        
        // Declaração de variáveis utilizadas como parâmetros pela função assinar da classe AssinarTXT.
        final String localDocumento = "src/arquivos/teste.txt";
        final String localKeystore = "/keystore.jks";
        final String nomeKeyStore = "mykey";
        final String senhaKeyStore = "store123";
        final String senhaPrivateKey = "key123";
        final String nomeCertificado = "mykey";
        
        // Chamada ao método para assinar 
        AssinaturaTXT signtxt = new AssinaturaTXT();
        signtxt.assinar(localDocumento, localKeystore, nomeKeyStore, senhaKeyStore, 
            senhaPrivateKey, nomeCertificado);
    }  
}
