/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.Article;
import cms_association.cmsassociation.Association;
import cms_association.cmsassociation.CmsassociationPackage;
import cms_association.cmsassociation.Demande;
import cms_association.cmsassociation.Formulaire;
import cms_association.cmsassociation.Media;
import cms_association.cmsassociation.Page;
import cms_association.cmsassociation.Role;
import cms_association.cmsassociation.Utilisateur;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getNumTel <em>Num Tel</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getFormulaires <em>Formulaires</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getDemandes <em>Demandes</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getUtilisateurs <em>Utilisateurs</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getArticles <em>Articles</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.AssociationImpl#getMedias <em>Medias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends EntiteImpl implements Association {
	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumTel() <em>Num Tel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTel()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_TEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumTel() <em>Num Tel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTel()
	 * @generated
	 * @ordered
	 */
	protected String numTel = NUM_TEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormulaires() <em>Formulaires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulaires()
	 * @generated
	 * @ordered
	 */
	protected EList<Formulaire> formulaires;

	/**
	 * The cached value of the '{@link #getDemandes() <em>Demandes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandes()
	 * @generated
	 * @ordered
	 */
	protected EList<Demande> demandes;

	/**
	 * The cached value of the '{@link #getUtilisateurs() <em>Utilisateurs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisateurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Utilisateur> utilisateurs;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getArticles() <em>Articles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticles()
	 * @generated
	 * @ordered
	 */
	protected EList<Article> articles;

	/**
	 * The cached value of the '{@link #getMedias() <em>Medias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedias()
	 * @generated
	 * @ordered
	 */
	protected EList<Media> medias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsassociationPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.ASSOCIATION__EMAIL, oldEmail,
					email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.ASSOCIATION__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumTel() {
		return numTel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumTel(String newNumTel) {
		String oldNumTel = numTel;
		numTel = newNumTel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.ASSOCIATION__NUM_TEL, oldNumTel,
					numTel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.ASSOCIATION__ADRESSE,
					oldAdresse, adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formulaire> getFormulaires() {
		if (formulaires == null) {
			formulaires = new EObjectContainmentWithInverseEList<Formulaire>(Formulaire.class, this,
					CmsassociationPackage.ASSOCIATION__FORMULAIRES, CmsassociationPackage.FORMULAIRE__ASSOCIATION);
		}
		return formulaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Demande> getDemandes() {
		if (demandes == null) {
			demandes = new EObjectContainmentEList<Demande>(Demande.class, this,
					CmsassociationPackage.ASSOCIATION__DEMANDES);
		}
		return demandes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Utilisateur> getUtilisateurs() {
		if (utilisateurs == null) {
			utilisateurs = new EObjectContainmentEList<Utilisateur>(Utilisateur.class, this,
					CmsassociationPackage.ASSOCIATION__UTILISATEURS);
		}
		return utilisateurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, CmsassociationPackage.ASSOCIATION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, CmsassociationPackage.ASSOCIATION__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Article> getArticles() {
		if (articles == null) {
			articles = new EObjectContainmentEList<Article>(Article.class, this,
					CmsassociationPackage.ASSOCIATION__ARTICLES);
		}
		return articles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Media> getMedias() {
		if (medias == null) {
			medias = new EObjectContainmentEList<Media>(Media.class, this, CmsassociationPackage.ASSOCIATION__MEDIAS);
		}
		return medias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsassociationPackage.ASSOCIATION__FORMULAIRES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFormulaires()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsassociationPackage.ASSOCIATION__FORMULAIRES:
			return ((InternalEList<?>) getFormulaires()).basicRemove(otherEnd, msgs);
		case CmsassociationPackage.ASSOCIATION__DEMANDES:
			return ((InternalEList<?>) getDemandes()).basicRemove(otherEnd, msgs);
		case CmsassociationPackage.ASSOCIATION__UTILISATEURS:
			return ((InternalEList<?>) getUtilisateurs()).basicRemove(otherEnd, msgs);
		case CmsassociationPackage.ASSOCIATION__ROLES:
			return ((InternalEList<?>) getRoles()).basicRemove(otherEnd, msgs);
		case CmsassociationPackage.ASSOCIATION__PAGES:
			return ((InternalEList<?>) getPages()).basicRemove(otherEnd, msgs);
		case CmsassociationPackage.ASSOCIATION__ARTICLES:
			return ((InternalEList<?>) getArticles()).basicRemove(otherEnd, msgs);
		case CmsassociationPackage.ASSOCIATION__MEDIAS:
			return ((InternalEList<?>) getMedias()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsassociationPackage.ASSOCIATION__EMAIL:
			return getEmail();
		case CmsassociationPackage.ASSOCIATION__NOM:
			return getNom();
		case CmsassociationPackage.ASSOCIATION__NUM_TEL:
			return getNumTel();
		case CmsassociationPackage.ASSOCIATION__ADRESSE:
			return getAdresse();
		case CmsassociationPackage.ASSOCIATION__FORMULAIRES:
			return getFormulaires();
		case CmsassociationPackage.ASSOCIATION__DEMANDES:
			return getDemandes();
		case CmsassociationPackage.ASSOCIATION__UTILISATEURS:
			return getUtilisateurs();
		case CmsassociationPackage.ASSOCIATION__ROLES:
			return getRoles();
		case CmsassociationPackage.ASSOCIATION__PAGES:
			return getPages();
		case CmsassociationPackage.ASSOCIATION__ARTICLES:
			return getArticles();
		case CmsassociationPackage.ASSOCIATION__MEDIAS:
			return getMedias();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsassociationPackage.ASSOCIATION__EMAIL:
			setEmail((String) newValue);
			return;
		case CmsassociationPackage.ASSOCIATION__NOM:
			setNom((String) newValue);
			return;
		case CmsassociationPackage.ASSOCIATION__NUM_TEL:
			setNumTel((String) newValue);
			return;
		case CmsassociationPackage.ASSOCIATION__ADRESSE:
			setAdresse((String) newValue);
			return;
		case CmsassociationPackage.ASSOCIATION__FORMULAIRES:
			getFormulaires().clear();
			getFormulaires().addAll((Collection<? extends Formulaire>) newValue);
			return;
		case CmsassociationPackage.ASSOCIATION__DEMANDES:
			getDemandes().clear();
			getDemandes().addAll((Collection<? extends Demande>) newValue);
			return;
		case CmsassociationPackage.ASSOCIATION__UTILISATEURS:
			getUtilisateurs().clear();
			getUtilisateurs().addAll((Collection<? extends Utilisateur>) newValue);
			return;
		case CmsassociationPackage.ASSOCIATION__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case CmsassociationPackage.ASSOCIATION__PAGES:
			getPages().clear();
			getPages().addAll((Collection<? extends Page>) newValue);
			return;
		case CmsassociationPackage.ASSOCIATION__ARTICLES:
			getArticles().clear();
			getArticles().addAll((Collection<? extends Article>) newValue);
			return;
		case CmsassociationPackage.ASSOCIATION__MEDIAS:
			getMedias().clear();
			getMedias().addAll((Collection<? extends Media>) newValue);
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
		case CmsassociationPackage.ASSOCIATION__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case CmsassociationPackage.ASSOCIATION__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case CmsassociationPackage.ASSOCIATION__NUM_TEL:
			setNumTel(NUM_TEL_EDEFAULT);
			return;
		case CmsassociationPackage.ASSOCIATION__ADRESSE:
			setAdresse(ADRESSE_EDEFAULT);
			return;
		case CmsassociationPackage.ASSOCIATION__FORMULAIRES:
			getFormulaires().clear();
			return;
		case CmsassociationPackage.ASSOCIATION__DEMANDES:
			getDemandes().clear();
			return;
		case CmsassociationPackage.ASSOCIATION__UTILISATEURS:
			getUtilisateurs().clear();
			return;
		case CmsassociationPackage.ASSOCIATION__ROLES:
			getRoles().clear();
			return;
		case CmsassociationPackage.ASSOCIATION__PAGES:
			getPages().clear();
			return;
		case CmsassociationPackage.ASSOCIATION__ARTICLES:
			getArticles().clear();
			return;
		case CmsassociationPackage.ASSOCIATION__MEDIAS:
			getMedias().clear();
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
		case CmsassociationPackage.ASSOCIATION__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case CmsassociationPackage.ASSOCIATION__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case CmsassociationPackage.ASSOCIATION__NUM_TEL:
			return NUM_TEL_EDEFAULT == null ? numTel != null : !NUM_TEL_EDEFAULT.equals(numTel);
		case CmsassociationPackage.ASSOCIATION__ADRESSE:
			return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
		case CmsassociationPackage.ASSOCIATION__FORMULAIRES:
			return formulaires != null && !formulaires.isEmpty();
		case CmsassociationPackage.ASSOCIATION__DEMANDES:
			return demandes != null && !demandes.isEmpty();
		case CmsassociationPackage.ASSOCIATION__UTILISATEURS:
			return utilisateurs != null && !utilisateurs.isEmpty();
		case CmsassociationPackage.ASSOCIATION__ROLES:
			return roles != null && !roles.isEmpty();
		case CmsassociationPackage.ASSOCIATION__PAGES:
			return pages != null && !pages.isEmpty();
		case CmsassociationPackage.ASSOCIATION__ARTICLES:
			return articles != null && !articles.isEmpty();
		case CmsassociationPackage.ASSOCIATION__MEDIAS:
			return medias != null && !medias.isEmpty();
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
		result.append(" (email: ");
		result.append(email);
		result.append(", nom: ");
		result.append(nom);
		result.append(", numTel: ");
		result.append(numTel);
		result.append(", adresse: ");
		result.append(adresse);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
