/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.CmsassociationPackage;
import cms_association.cmsassociation.ContenuCMS;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenu CMS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.impl.ContenuCMSImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.ContenuCMSImpl#isPublie <em>Publie</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.ContenuCMSImpl#getDateCreation <em>Date Creation</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.ContenuCMSImpl#getDateModification <em>Date Modification</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.ContenuCMSImpl#getSlug <em>Slug</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContenuCMSImpl extends MinimalEObjectImpl.Container implements ContenuCMS {
	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected String titre = TITRE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublie() <em>Publie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublie()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublie() <em>Publie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublie()
	 * @generated
	 * @ordered
	 */
	protected boolean publie = PUBLIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateCreation() <em>Date Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreation()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_CREATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCreation() <em>Date Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreation()
	 * @generated
	 * @ordered
	 */
	protected Date dateCreation = DATE_CREATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateModification() <em>Date Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateModification()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_MODIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateModification() <em>Date Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateModification()
	 * @generated
	 * @ordered
	 */
	protected Date dateModification = DATE_MODIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlug() <em>Slug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlug()
	 * @generated
	 * @ordered
	 */
	protected static final String SLUG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlug() <em>Slug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlug()
	 * @generated
	 * @ordered
	 */
	protected String slug = SLUG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenuCMSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsassociationPackage.Literals.CONTENU_CMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitre(String newTitre) {
		String oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.CONTENU_CMS__TITRE, oldTitre,
					titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublie() {
		return publie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublie(boolean newPublie) {
		boolean oldPublie = publie;
		publie = newPublie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.CONTENU_CMS__PUBLIE, oldPublie,
					publie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCreation(Date newDateCreation) {
		Date oldDateCreation = dateCreation;
		dateCreation = newDateCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.CONTENU_CMS__DATE_CREATION,
					oldDateCreation, dateCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateModification() {
		return dateModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateModification(Date newDateModification) {
		Date oldDateModification = dateModification;
		dateModification = newDateModification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.CONTENU_CMS__DATE_MODIFICATION,
					oldDateModification, dateModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlug(String newSlug) {
		String oldSlug = slug;
		slug = newSlug;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.CONTENU_CMS__SLUG, oldSlug,
					slug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsassociationPackage.CONTENU_CMS__TITRE:
			return getTitre();
		case CmsassociationPackage.CONTENU_CMS__PUBLIE:
			return isPublie();
		case CmsassociationPackage.CONTENU_CMS__DATE_CREATION:
			return getDateCreation();
		case CmsassociationPackage.CONTENU_CMS__DATE_MODIFICATION:
			return getDateModification();
		case CmsassociationPackage.CONTENU_CMS__SLUG:
			return getSlug();
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
		case CmsassociationPackage.CONTENU_CMS__TITRE:
			setTitre((String) newValue);
			return;
		case CmsassociationPackage.CONTENU_CMS__PUBLIE:
			setPublie((Boolean) newValue);
			return;
		case CmsassociationPackage.CONTENU_CMS__DATE_CREATION:
			setDateCreation((Date) newValue);
			return;
		case CmsassociationPackage.CONTENU_CMS__DATE_MODIFICATION:
			setDateModification((Date) newValue);
			return;
		case CmsassociationPackage.CONTENU_CMS__SLUG:
			setSlug((String) newValue);
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
		case CmsassociationPackage.CONTENU_CMS__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case CmsassociationPackage.CONTENU_CMS__PUBLIE:
			setPublie(PUBLIE_EDEFAULT);
			return;
		case CmsassociationPackage.CONTENU_CMS__DATE_CREATION:
			setDateCreation(DATE_CREATION_EDEFAULT);
			return;
		case CmsassociationPackage.CONTENU_CMS__DATE_MODIFICATION:
			setDateModification(DATE_MODIFICATION_EDEFAULT);
			return;
		case CmsassociationPackage.CONTENU_CMS__SLUG:
			setSlug(SLUG_EDEFAULT);
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
		case CmsassociationPackage.CONTENU_CMS__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case CmsassociationPackage.CONTENU_CMS__PUBLIE:
			return publie != PUBLIE_EDEFAULT;
		case CmsassociationPackage.CONTENU_CMS__DATE_CREATION:
			return DATE_CREATION_EDEFAULT == null ? dateCreation != null : !DATE_CREATION_EDEFAULT.equals(dateCreation);
		case CmsassociationPackage.CONTENU_CMS__DATE_MODIFICATION:
			return DATE_MODIFICATION_EDEFAULT == null ? dateModification != null
					: !DATE_MODIFICATION_EDEFAULT.equals(dateModification);
		case CmsassociationPackage.CONTENU_CMS__SLUG:
			return SLUG_EDEFAULT == null ? slug != null : !SLUG_EDEFAULT.equals(slug);
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
		result.append(" (titre: ");
		result.append(titre);
		result.append(", publie: ");
		result.append(publie);
		result.append(", dateCreation: ");
		result.append(dateCreation);
		result.append(", dateModification: ");
		result.append(dateModification);
		result.append(", slug: ");
		result.append(slug);
		result.append(')');
		return result.toString();
	}

} //ContenuCMSImpl
