
package com.universal.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.universal.domain.Book;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.universal.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchBookReturn_QNAME = new QName("http://service.universal.com", "searchBookReturn");
    private final static QName _Isbn_QNAME = new QName("http://service.universal.com", "isbn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.universal.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.universal.com", name = "searchBookReturn")
    public JAXBElement<Book> createSearchBookReturn(Book value) {
        return new JAXBElement<Book>(_SearchBookReturn_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.universal.com", name = "isbn")
    public JAXBElement<Integer> createIsbn(Integer value) {
        return new JAXBElement<Integer>(_Isbn_QNAME, Integer.class, null, value);
    }

}
