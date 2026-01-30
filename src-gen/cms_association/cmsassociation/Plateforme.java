/**
 */
package cms_association.cmsassociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plateforme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.Plateforme#getAssociations <em>Associations</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Plateforme#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see cms_association.cmsassociation.CmsassociationPackage#getPlateforme()
 * @model
 * @generated
 */
public interface Plateforme extends EObject {
	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link cms_association.cmsassociation.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see cms_association.cmsassociation.CmsassociationPackage#getPlateforme_Associations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociations();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getPlateforme_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Plateforme#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Plateforme
