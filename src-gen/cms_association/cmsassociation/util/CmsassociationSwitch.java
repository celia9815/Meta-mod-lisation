/**
 */
package cms_association.cmsassociation.util;

import cms_association.cmsassociation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cms_association.cmsassociation.CmsassociationPackage
 * @generated
 */
public class CmsassociationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CmsassociationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsassociationSwitch() {
		if (modelPackage == null) {
			modelPackage = CmsassociationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CmsassociationPackage.ENTITE: {
			Entite entite = (Entite) theEObject;
			T result = caseEntite(entite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.ASSOCIATION: {
			Association association = (Association) theEObject;
			T result = caseAssociation(association);
			if (result == null)
				result = caseEntite(association);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.UTILISATEUR: {
			Utilisateur utilisateur = (Utilisateur) theEObject;
			T result = caseUtilisateur(utilisateur);
			if (result == null)
				result = caseEntite(utilisateur);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.ROLE: {
			Role role = (Role) theEObject;
			T result = caseRole(role);
			if (result == null)
				result = caseEntite(role);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.FORMULAIRE: {
			Formulaire formulaire = (Formulaire) theEObject;
			T result = caseFormulaire(formulaire);
			if (result == null)
				result = caseEntite(formulaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.CHAMP: {
			Champ champ = (Champ) theEObject;
			T result = caseChamp(champ);
			if (result == null)
				result = caseEntite(champ);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.DEMANDE: {
			Demande demande = (Demande) theEObject;
			T result = caseDemande(demande);
			if (result == null)
				result = caseEntite(demande);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.PLATEFORME: {
			Plateforme plateforme = (Plateforme) theEObject;
			T result = casePlateforme(plateforme);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.REPONSE: {
			Reponse reponse = (Reponse) theEObject;
			T result = caseReponse(reponse);
			if (result == null)
				result = caseEntite(reponse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.CONTENU_CMS: {
			ContenuCMS contenuCMS = (ContenuCMS) theEObject;
			T result = caseContenuCMS(contenuCMS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.PAGE: {
			Page page = (Page) theEObject;
			T result = casePage(page);
			if (result == null)
				result = caseContenuCMS(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.ARTICLE: {
			Article article = (Article) theEObject;
			T result = caseArticle(article);
			if (result == null)
				result = caseContenuCMS(article);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CmsassociationPackage.MEDIA: {
			Media media = (Media) theEObject;
			T result = caseMedia(media);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntite(Entite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilisateur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilisateur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilisateur(Utilisateur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formulaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formulaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulaire(Formulaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Champ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Champ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChamp(Champ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Demande</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Demande</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemande(Demande object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plateforme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plateforme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlateforme(Plateforme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReponse(Reponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenu CMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenu CMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenuCMS(ContenuCMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Article</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Article</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticle(Article object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedia(Media object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CmsassociationSwitch
