/*
 * PROG09: Clase de apoyo para manejo de �rboles DOM
 * Se completa con algunos m�todos propios para recuperaci�n e inserci�n de datos
 */

package miGPUI;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 * Utilidades para pasar �rboles DOM a documentos XML y viceversa.
 * 
 * @since versi�n 1.5 de Tareas Prog, incorpor�do el 23/03/2014
 * @author Salvador Romero Villegas (m�todos XML2DOM, String2DOM, DOM2XML, 
 *                                   DOM2XML, crearDOMVacio)
 * @author Roc�o de Mula (m�todos a�adirHijoARaiz, a�adirHijoAElemento,  
 *                        extraerHijoDeRaiz, ExtraerHijodDeElemento)
 * @version 1.5 23/03/2014 PROG09 (incorporado)
 */
public class DOMUtil {

    /**
     * Carga un archivo con un documento XML a un árbol DOM.      
     * @param CaminoAArchivoXml puede ser un archivo local de tu disco duro
     * o una URI de Internet (http://...).
     * @return el documento DOM o null si no se ha podido cargar el documento.
     */    
    public static Document XML2DOM (String CaminoAArchivoXml)
    {
        Document doc=null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc=db.parse(CaminoAArchivoXml);            
           
        } catch (Exception ex) {
            Logger.getLogger(DOMUtil.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return doc;
    }

    /**
     * Convierte una cadena que contiene un documento XML a un �rbol DOM.
     * @param documentoXML cadena que contiene el documento XML.
     * @return El �rbol DOM o null si no se ha podido convertir.
     */
    public static Document String2DOM (String documentoXML)
    {
        ByteArrayInputStream bais=new ByteArrayInputStream(documentoXML.getBytes());
        Document doc=null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc=db.parse(bais);            
           
        } catch (Exception ex) {
            Logger.getLogger(DOMUtil.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return doc;
    }
    
    /**
     * Convierte un árbol DOM a una cadena que contiene un documento XML.
     * @param doc �rbol DOM.
     * @return null si no se ha podido convertir o la cadena con el documento
     * en XML si se ha podido convertir.
     */
    public static String DOM2XML (Document doc)
    {
        String xmlString=null;
        try {            
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");            
            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
            xmlString = result.getWriter().toString();
        } catch (TransformerException ex) {
            Logger.getLogger(DOMUtil.class.getName()).log(Level.SEVERE, null, ex);
            xmlString=null;
        }
        return xmlString;
    }
    
    /**
     * Convierte un �rbol DOM a XML y lo guarda en un archivo.
     * @param doc Documento a convertir en XML.
     * @param CaminoAlArchivoXML Camino o path para llegar al archivo en el
     * disco.
     * @return true si se ha podido convertir y false en cualquier otra situación.
     */
    public static boolean DOM2XML (Document doc, String CaminoAlArchivoXML)
    {
        try {
            File f=new File(CaminoAlArchivoXML);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");            
            StreamResult result = new StreamResult(f);            
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);         
            return true;
        } catch (TransformerException ex) {
            Logger.getLogger(DOMUtil.class.getName()).log(Level.SEVERE, null, ex);            
        }
        return false;
    }
    
    /**
     * Crea un �rbol DOM vac�o.
     * @param etiquetaRaiz Nombre de la etiqueta ra�z del �rbol DOM, donce
     * estar� contenida el resto del documento.
     * @return Retornar� el documento creado o null si se ha producido alg�n 
     * error.
     */    
    public static Document crearDOMVacio(String etiquetaRaiz)
    {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db;
        try {
            db = dbf.newDocumentBuilder();
            Document d=db.newDocument();
            d.appendChild(d.createElement(etiquetaRaiz));
            return d;
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DOMUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     * Crea un elemento nuevo y su contenido, al nodo ra�z del arbol DOM. 
     * En caso de que exista alg�n problema con la incorporaci�n, salta la 
     * excepci�n.
     * 
     * @since version 1.5 PROG09 23/03/2014
     * @param documento objeto Document donde se quiere incluir el nuevo elemento
     * @param etiqueta String con el nombre de la etiqueta del elemento nuevo
     * @param valor Object con dato que se quiere almacenar en la etiqueta.
     * @throws DOMException 
     */
    public static void crearHijoEnRaiz(Document documento, String etiqueta, 
            Object valor) throws DOMException {
        //Pendiente mejorar este m�todo incorporando datos gen�ricos en vez de Object
        Element nuevoElemento = documento.createElement(etiqueta);
        Text textoNuevoElemento = documento.createTextNode(String.valueOf(valor));
        nuevoElemento.appendChild(textoNuevoElemento);
        documento.getDocumentElement().appendChild(nuevoElemento);
    }

    /**
     * Crea un elemento nuevo vacío, al nodo ra�z del arbol DOM. 
     * Devuelve el Element nuevo creado, que podr� usarse para crear los hijos
     * de �ste, si es necesario.
     * En caso de que exista alg�n problema con la incorporaci�n, salta la 
     * excepci�n.
     * 
     * @since version 1.5 PROG09 23/03/2014
     * @param documento objeto Document donde se quiere incluir el nuevo elemento
     * @param etiqueta String con el nombre de la etiqueta del elemento nuevo
     * @return Element con el elemento nuevo que se ha creado.
     * @throws DOMException 
     */
    public static Element crearHijoEnRaiz(Document documento, String etiqueta) throws DOMException {
        Element nuevoElemento = documento.createElement(etiqueta);
        documento.getDocumentElement().appendChild(nuevoElemento);
        return nuevoElemento;
                
    }
    
    /**
     * Crea un elemento nuevo y su contenido, a un elemento existente en el DOM. 
     * En caso de que exista algún problema con la incorporaci�n, salta la 
     * excepci�n.
     * 
     * @since version 1.5 PROG09 23/03/2014
     * @param documento objeto Document donde se encuentra elemento existente.
     * @param elemento elemento Element onde se quiere incluir el nuevo elemento
     * @param etiqueta String con el nombre de la etiqueta del elemento nuevo
     * @param valor Object con dato que se quiere almacenar en la etiqueta.
     * @throws DOMException 
     */
    public static void crearHijoEnElemento(Document documento, Element elemento, 
            String etiqueta, Object valor) throws DOMException {
        //Pendiente mejorar este m�todo incorporando datos gen�ricos en vez de Object
        Element nuevoElemento = documento.createElement(etiqueta);
        Text textoNuevoElemento = documento.createTextNode(String.valueOf(valor));
        nuevoElemento.appendChild(textoNuevoElemento);
        elemento.appendChild(nuevoElemento);
    }
    
    /**
     * A�ade un elemento nuevo vac�o, a un elemento existente en el DOM. 
     * Devuelve el Element nuevo creado, que podr� usarse para crear los hijos
     * de �ste, si es necesario.
     * En caso de que exista alg�n problema con la incorporaci�n, salta la 
     * excepci�n.
     * 
     * @since version 1.5 PROG09 23/03/2014
     * @param documento objeto Document donde se encuentra elemento existente.
     * @param elemento elemento Element onde se quiere incluir el nuevo elemento
     * @param etiqueta String con el nombre de la etiqueta del elemento nuevo
     * @return Element con el elemento nuevo que se ha creado.
     * @throws DOMException 
     */
    public static Element crearHijoEnElemento(Document documento, Element elemento, 
            String etiqueta) throws DOMException {
        Element nuevoElemento = documento.createElement(etiqueta);
        elemento.appendChild(nuevoElemento);
        return nuevoElemento;
    }
    
    /**
     * Extrae el String correspondiente al contenido de una etiqueta concreta
     * en el elemento raiz del �rbol DOM. En caso de que exista alg�n problema en la recuperacion
     * lanza la excepcion
     * 
     * @param documento Document en cuyo elemento ra�z se encuentra la etiqueta 
     * @param etiqueta String con el nombre de la etiqueta del dato buscado
     * @return String con el dato contenido en la etiqueta especificada.
     * @throws Exception 
     */
    public static String extraerHijoDeRaiz(Document documento, String etiqueta) throws Exception{
        //Pendiente mejorar este m�todo incorporando datos gen�ricos en vez de String
        String valor;
        NodeList listaNodos=documento.getElementsByTagName(etiqueta);
        if (listaNodos.getLength()==1){
            Element elementoExtraido = (Element) listaNodos.item(0);
            valor = elementoExtraido.getTextContent().toString();
        }else{
            throw new Exception("Fallo al recuperar " + etiqueta);
        }
        return valor;
    }
    
    /**
     * Extrae el String correspondiente al contenido de una etiqueta concreta
     * en otro elemento hijo del elemento raiz del �rbol DOM. En caso de que no
     * exista ninguna etiqueta con ese nombre, lanza una excepci�n con un mensaje 
     * de que la etiqueta no existe. En otro caso, lanza un mensaje de fallo 
     * gen�rico de alg�n problema en la recuperacion del dato.
     * 
     * @param elemento Element con el elemento padre de la etiqueta que buscamos.
     * @param etiqueta String con la etiqueta del elemento que buscamos.
     * @return String cn el valor contenido en la etiqueta especificada.
     * @throws Exception 
     */
    public static String extraerHijoDeElemento(Element elemento, String etiqueta) throws Exception{
        //Pendiente mejorar este m�todo incorporando datos gen�ricos en vez de String
        String valor;
        NodeList listaHijosElemento = elemento.getElementsByTagName(etiqueta);
        if (listaHijosElemento.getLength()==1){
        Element primerHijo = (Element) listaHijosElemento.item(0);
        NodeList primerValor = primerHijo.getChildNodes();
        valor = ((Node) primerValor.item(0)).getNodeValue().toString();
        }else{
            if (listaHijosElemento.getLength()==0){
                throw new Exception("No existe " + etiqueta);
            }else{
                throw new Exception("Fallo al recuperar " + etiqueta);
            }
        }
        return valor;
    }
    
}
