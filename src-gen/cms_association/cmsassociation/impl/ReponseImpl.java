/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.Champ;
import cms_association.cmsassociation.CmsassociationPackage;
import cms_association.cmsassociation.Reponse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reponse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.impl.ReponseImpl#getValeur <em>Valeur</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.ReponseImpl#getChamp <em>Champ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReponseImpl extends EntiteImpl implements Reponse {
	/**
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final String VALEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected String valeur = VALEUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChamp() <em>Champ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChamp()
	 * @generated
	 * @ordered
	 */
	protected Champ champ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsassociationPackage.Literals.REPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur(String newValeur) {
		String oldValeur = valeur;
		valeur = newValeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.REPONSE__VALEUR, oldValeur,
					valeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Champ getChamp() {
		if (champ != null && champ.eIsProxy()) {
			InternalEObject oldChamp = (InternalEObject) champ;
			champ = (Champ) eResolveProxy(oldChamp);
			if (champ != oldChamp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsassociationPackage.REPONSE__CHAMP,
							oldChamp, champ));
			}
		}
		return champ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Champ basicGetChamp() {
		return champ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChamp(Champ newChamp) {
		Champ oldChamp = champ;
		champ = newChamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.REPONSE__CHAMP, oldChamp,
					champ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsassociationPackage.REPONSE__VALEUR:
			return getValeur();
		case CmsassociationPackage.REPONSE__CHAMP:
			if (resolve)
				return getChamp();
			return basicGetChamp();
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
		case CmsassociationPackage.REPONSE__VALEUR:
			setValeur((String) newValue);
			return;
		case CmsassociationPackage.REPONSE__CHAMP:
			setChamp((Champ) newValue);
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
		case CmsassociationPackage.REPONSE__VALEUR:
			setValeur(VALEUR_EDEFAULT);
			return;
		case CmsassociationPackage.REPONSE__CHAMP:
			setChamp((Champ) null);
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
		case CmsassociationPackage.REPONSE__VALEUR:
			return VALEUR_EDEFAULT == null ? valeur != null : !VALEUR_EDEFAULT.equals(valeur);
		case CmsassociationPackage.REPONSE__CHAMP:
			return champ != null;
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
		result.append(" (valeur: ");
		result.append(valeur);
		result.append(')');
		return result.toString();
	}

} //ReponseImpl
