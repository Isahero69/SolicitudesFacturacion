package HTML;

import Controladora.Facturacion;

public class HTMLContent {

    public String estiloHTML(Facturacion contenido) {
        // Construir el contenido HTML con estilo CSS
        String getHtml = """
                         <html><head><style>body { font-family: Arial, sans-serif; }h1 {color: #333;}h2 {color: #333;}p {color: #666;}.tabla1{padding: 16px;
                               background-color: #F6F7F9;
                               border-collapse: collapse;
                               width: auto;
                               height: 20px;}</style></head><body><h2>""" + contenido.getUsuario() + "</h2> "
                + "<h3> ha generado solicitud para facturacion electronica </h3>"
                + "<h4> fecha de solicitud: " + contenido.getFechaSolicitud() + "</h4"
                + "<table class = tabla1>"
                + "<thead>"
                + "<tr>"
                + "<th>NIT Cliente</th>"
                + "<th>Nombre Cliente</th>"
                + "<th>Relacion Comercial</th>"
                + "<th>Tipo de Persona</th>"
                + "<th>Correo Electronico</th>"
                + "<th>Contacto</th>"
                + "</tr>"
                + "</thead>"
                + "<tbody>"
                + "<td>" + contenido.getNitCliente() + "</td>"
                + "<td>" + contenido.getNombreCliente() + "</td>"
                + "<td>" + contenido.getRelacionComercial() + "</td>"
                + "<td>" + contenido.getTipoCliente() + "</td>"
                + "<td>" + contenido.getCorreoCliente() + "</td>"
                + "<td>" + contenido.getTelefonoCliente() + "</td>"
                + "</tbody>"
                + "</table"
                + "<table>"
                + "<thead>"
                + "<tr>"
                + "<th>Anexos</th>"
                + "<th>Observaciones</th>"
                + "</tr>"
                + "</thead>"
                + "<tbody>"
                + "<td>" + contenido.getAnexos() + "</td>"
                + "<td>" + contenido.getObservaciones() + "</td>"
                + "</tbody>"
                + "</table"
                + "</body>"
                + "</html>";

        return getHtml;
    }
}
