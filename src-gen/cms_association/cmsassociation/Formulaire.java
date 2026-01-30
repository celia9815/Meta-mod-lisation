/**
 */
package cms_association.cmsassociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formulaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.Formulaire#getNom <em>Nom</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Formulaire#getDescription <em>Description</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Formulaire#getChamps <em>Champs</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Formulaire#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @see cms_association.cmsassociation.CmsassociationPackage#getFormulaire()
 * @model
 * @generated
 */
public interface Formulaire extends Entite {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getFormulaire_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Formulaire#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getFormulaire_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Formulaire#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Champs</b></em>' containment reference list.
	 * The list contents are of type {@link cms_association.cmsassociation.Champ}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champs</em>' containment reference list.
	 * @see cms_association.cmsassociation.CmsassociationPackage#getFormulaire_Champs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Champ> getChamps();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cms_association.cmsassociation.Association#getFormulaires <em>Formulaires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' container reference.
	 * @see #setAssociation(Association)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getFormulaire_Association()
	 * @see cms_association.cmsassociation.Association#getFormulaires
	 * @model opposite="formulaires" required="true" transient="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Formulaire#getAssociation <em>Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' container reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

} // Formulaire
