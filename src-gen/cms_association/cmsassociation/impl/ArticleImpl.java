/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.Article;
import cms_association.cmsassociation.CmsassociationPackage;
import cms_association.cmsassociation.Utilisateur;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.impl.ArticleImpl#getResume <em>Resume</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.ArticleImpl#getDatePublication <em>Date Publication</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.ArticleImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.ArticleImpl#getAuteur <em>Auteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleImpl extends ContenuCMSImpl implements Article {
	/**
	 * The default value of the '{@link #getResume() <em>Resume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResume()
	 * @generated
	 * @ordered
	 */
	protected static final String RESUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResume() <em>Resume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResume()
	 * @generated
	 * @ordered
	 */
	protected String resume = RESUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatePublication() <em>Date Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePublication()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_PUBLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatePublication() <em>Date Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePublication()
	 * @generated
	 * @ordered
	 */
	protected Date datePublication = DATE_PUBLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected String contenu = CONTENU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuteur() <em>Auteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuteur()
	 * @generated
	 * @ordered
	 */
	protected Utilisateur auteur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsassociationPackage.Literals.ARTICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResume() {
		return resume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResume(String newResume) {
		String oldResume = resume;
		resume = newResume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.ARTICLE__RESUME, oldResume,
					resume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatePublication() {
		return datePublication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePublication(Date newDatePublication) {
		Date oldDatePublication = datePublication;
		datePublication = newDatePublication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.ARTICLE__DATE_PUBLICATION,
					oldDatePublication, datePublication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContenu() {
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenu(String newContenu) {
		String oldContenu = contenu;
		contenu = newContenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.ARTICLE__CONTENU, oldContenu,
					contenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilisateur getAuteur() {
		if (auteur != null && auteur.eIsProxy()) {
			InternalEObject oldAuteur = (InternalEObject) auteur;
			auteur = (Utilisateur) eResolveProxy(oldAuteur);
			if (auteur != oldAuteur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsassociationPackage.ARTICLE__AUTEUR,
							oldAuteur, auteur));
			}
		}
		return auteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilisateur basicGetAuteur() {
		return auteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuteur(Utilisateur newAuteur) {
		Utilisateur oldAuteur = auteur;
		auteur = newAuteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.ARTICLE__AUTEUR, oldAuteur,
					auteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsassociationPackage.ARTICLE__RESUME:
			return getResume();
		case CmsassociationPackage.ARTICLE__DATE_PUBLICATION:
			return getDatePublication();
		case CmsassociationPackage.ARTICLE__CONTENU:
			return getContenu();
		case CmsassociationPackage.ARTICLE__AUTEUR:
			if (resolve)
				return getAuteur();
			return basicGetAuteur();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsassociationPackage.ARTICLE__RESUME:
			setResume((String) newValue);
			return;
		case CmsassociationPackage.ARTICLE__DATE_PUBLICATION:
			setDatePublication((Date) newValue);
			return;
		case CmsassociationPackage.ARTICLE__CONTENU:
			setContenu((String) newValue);
			return;
		case CmsassociationPackage.ARTICLE__AUTEUR:
			setAuteur((Utilisateur) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CmsassociationPackage.ARTICLE__RESUME:
			setResume(RESUME_EDEFAULT);
			return;
		case CmsassociationPackage.ARTICLE__DATE_PUBLICATION:
			setDatePublication(DATE_PUBLICATION_EDEFAULT);
			return;
		case CmsassociationPackage.ARTICLE__CONTENU:
			setContenu(CONTENU_EDEFAULT);
			return;
		case CmsassociationPackage.ARTICLE__AUTEUR:
			setAuteur((Utilisateur) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CmsassociationPackage.ARTICLE__RESUME:
			return RESUME_EDEFAULT == null ? resume != null : !RESUME_EDEFAULT.equals(resume);
		case CmsassociationPackage.ARTICLE__DATE_PUBLICATION:
			return DATE_PUBLICATION_EDEFAULT == null ? datePublication != null
					: !DATE_PUBLICATION_EDEFAULT.equals(datePublication);
		case CmsassociationPackage.ARTICLE__CONTENU:
			return CONTENU_EDEFAULT == null ? contenu != null : !CONTENU_EDEFAULT.equals(contenu);
		case CmsassociationPackage.ARTICLE__AUTEUR:
			return auteur != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (resume: ");
		result.append(resume);
		result.append(", datePublication: ");
		result.append(datePublication);
		result.append(", contenu: ");
		result.append(contenu);
		result.append(')');
		return result.toString();
	}

} //ArticleImpl
