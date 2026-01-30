/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.CmsassociationPackage;
import cms_association.cmsassociation.Role;
import cms_association.cmsassociation.Utilisateur;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utilisateur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.impl.UtilisateurImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.UtilisateurImpl#getNomComplet <em>Nom Complet</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.UtilisateurImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilisateurImpl extends EntiteImpl implements Utilisateur {
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
	 * The default value of the '{@link #getNomComplet() <em>Nom Complet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomComplet()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_COMPLET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomComplet() <em>Nom Complet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomComplet()
	 * @generated
	 * @ordered
	 */
	protected String nomComplet = NOM_COMPLET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilisateurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsassociationPackage.Literals.UTILISATEUR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.UTILISATEUR__EMAIL, oldEmail,
					email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomComplet() {
		return nomComplet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomComplet(String newNomComplet) {
		String oldNomComplet = nomComplet;
		nomComplet = newNomComplet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.UTILISATEUR__NOM_COMPLET,
					oldNomComplet, nomComplet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject) role;
			role = (Role) eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsassociationPackage.UTILISATEUR__ROLE,
							oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.UTILISATEUR__ROLE, oldRole,
					role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsassociationPackage.UTILISATEUR__EMAIL:
			return getEmail();
		case CmsassociationPackage.UTILISATEUR__NOM_COMPLET:
			return getNomComplet();
		case CmsassociationPackage.UTILISATEUR__ROLE:
			if (resolve)
				return getRole();
			return basicGetRole();
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
		case CmsassociationPackage.UTILISATEUR__EMAIL:
			setEmail((String) newValue);
			return;
		case CmsassociationPackage.UTILISATEUR__NOM_COMPLET:
			setNomComplet((String) newValue);
			return;
		case CmsassociationPackage.UTILISATEUR__ROLE:
			setRole((Role) newValue);
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
		case CmsassociationPackage.UTILISATEUR__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case CmsassociationPackage.UTILISATEUR__NOM_COMPLET:
			setNomComplet(NOM_COMPLET_EDEFAULT);
			return;
		case CmsassociationPackage.UTILISATEUR__ROLE:
			setRole((Role) null);
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
		case CmsassociationPackage.UTILISATEUR__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case CmsassociationPackage.UTILISATEUR__NOM_COMPLET:
			return NOM_COMPLET_EDEFAULT == null ? nomComplet != null : !NOM_COMPLET_EDEFAULT.equals(nomComplet);
		case CmsassociationPackage.UTILISATEUR__ROLE:
			return role != null;
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
		result.append(", nomComplet: ");
		result.append(nomComplet);
		result.append(')');
		return result.toString();
	}

} //UtilisateurImpl
