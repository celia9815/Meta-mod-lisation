/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.Article;
import cms_association.cmsassociation.Association;
import cms_association.cmsassociation.Champ;
import cms_association.cmsassociation.ChampType;
import cms_association.cmsassociation.CmsassociationFactory;
import cms_association.cmsassociation.CmsassociationPackage;
import cms_association.cmsassociation.ContenuCMS;
import cms_association.cmsassociation.Demande;
import cms_association.cmsassociation.Entite;
import cms_association.cmsassociation.Formulaire;
import cms_association.cmsassociation.Media;
import cms_association.cmsassociation.MediaType;
import cms_association.cmsassociation.Page;
import cms_association.cmsassociation.Plateforme;
import cms_association.cmsassociation.Reponse;
import cms_association.cmsassociation.Role;
import cms_association.cmsassociation.Utilisateur;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmsassociationPackageImpl extends EPackageImpl implements CmsassociationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilisateurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass champEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demandeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plateformeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenuCMSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass articleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum champTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cms_association.cmsassociation.CmsassociationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CmsassociationPackageImpl() {
		super(eNS_URI, CmsassociationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CmsassociationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CmsassociationPackage init() {
		if (isInited)
			return (CmsassociationPackage) EPackage.Registry.INSTANCE.getEPackage(CmsassociationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCmsassociationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CmsassociationPackageImpl theCmsassociationPackage = registeredCmsassociationPackage instanceof CmsassociationPackageImpl
				? (CmsassociationPackageImpl) registeredCmsassociationPackage
				: new CmsassociationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCmsassociationPackage.createPackageContents();

		// Initialize created meta-data
		theCmsassociationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCmsassociationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CmsassociationPackage.eNS_URI, theCmsassociationPackage);
		return theCmsassociationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntite() {
		return entiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntite_Id() {
		return (EAttribute) entiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntite_Actif() {
		return (EAttribute) entiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Email() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Nom() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_NumTel() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Adresse() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Formulaires() {
		return (EReference) associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Demandes() {
		return (EReference) associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Utilisateurs() {
		return (EReference) associationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Roles() {
		return (EReference) associationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Pages() {
		return (EReference) associationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Articles() {
		return (EReference) associationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Medias() {
		return (EReference) associationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilisateur() {
		return utilisateurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilisateur_Email() {
		return (EAttribute) utilisateurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilisateur_NomComplet() {
		return (EAttribute) utilisateurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilisateur_Role() {
		return (EReference) utilisateurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Nom() {
		return (EAttribute) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulaire() {
		return formulaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Nom() {
		return (EAttribute) formulaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Description() {
		return (EAttribute) formulaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulaire_Champs() {
		return (EReference) formulaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulaire_Association() {
		return (EReference) formulaireEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChamp() {
		return champEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChamp_Libelle() {
		return (EAttribute) champEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChamp_Type() {
		return (EAttribute) champEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChamp_Obligatoire() {
		return (EAttribute) champEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemande() {
		return demandeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemande_Reference() {
		return (EAttribute) demandeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemande_DatePlanifiee() {
		return (EAttribute) demandeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemande_Description() {
		return (EAttribute) demandeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemande_Formulaire() {
		return (EReference) demandeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemande_Reponses() {
		return (EReference) demandeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlateforme() {
		return plateformeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlateforme_Associations() {
		return (EReference) plateformeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlateforme_Nom() {
		return (EAttribute) plateformeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReponse() {
		return reponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReponse_Valeur() {
		return (EAttribute) reponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReponse_Champ() {
		return (EReference) reponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenuCMS() {
		return contenuCMSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenuCMS_Titre() {
		return (EAttribute) contenuCMSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenuCMS_Publie() {
		return (EAttribute) contenuCMSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenuCMS_DateCreation() {
		return (EAttribute) contenuCMSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenuCMS_DateModification() {
		return (EAttribute) contenuCMSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenuCMS_Slug() {
		return (EAttribute) contenuCMSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Contenu() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArticle() {
		return articleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArticle_Resume() {
		return (EAttribute) articleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArticle_DatePublication() {
		return (EAttribute) articleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArticle_Contenu() {
		return (EAttribute) articleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArticle_Auteur() {
		return (EReference) articleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Nom() {
		return (EAttribute) mediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Url() {
		return (EAttribute) mediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Description() {
		return (EAttribute) mediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Type() {
		return (EAttribute) mediaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChampType() {
		return champTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaType() {
		return mediaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsassociationFactory getCmsassociationFactory() {
		return (CmsassociationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		entiteEClass = createEClass(ENTITE);
		createEAttribute(entiteEClass, ENTITE__ID);
		createEAttribute(entiteEClass, ENTITE__ACTIF);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__EMAIL);
		createEAttribute(associationEClass, ASSOCIATION__NOM);
		createEAttribute(associationEClass, ASSOCIATION__NUM_TEL);
		createEAttribute(associationEClass, ASSOCIATION__ADRESSE);
		createEReference(associationEClass, ASSOCIATION__FORMULAIRES);
		createEReference(associationEClass, ASSOCIATION__DEMANDES);
		createEReference(associationEClass, ASSOCIATION__UTILISATEURS);
		createEReference(associationEClass, ASSOCIATION__ROLES);
		createEReference(associationEClass, ASSOCIATION__PAGES);
		createEReference(associationEClass, ASSOCIATION__ARTICLES);
		createEReference(associationEClass, ASSOCIATION__MEDIAS);

		utilisateurEClass = createEClass(UTILISATEUR);
		createEAttribute(utilisateurEClass, UTILISATEUR__EMAIL);
		createEAttribute(utilisateurEClass, UTILISATEUR__NOM_COMPLET);
		createEReference(utilisateurEClass, UTILISATEUR__ROLE);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NOM);

		formulaireEClass = createEClass(FORMULAIRE);
		createEAttribute(formulaireEClass, FORMULAIRE__NOM);
		createEAttribute(formulaireEClass, FORMULAIRE__DESCRIPTION);
		createEReference(formulaireEClass, FORMULAIRE__CHAMPS);
		createEReference(formulaireEClass, FORMULAIRE__ASSOCIATION);

		champEClass = createEClass(CHAMP);
		createEAttribute(champEClass, CHAMP__LIBELLE);
		createEAttribute(champEClass, CHAMP__TYPE);
		createEAttribute(champEClass, CHAMP__OBLIGATOIRE);

		demandeEClass = createEClass(DEMANDE);
		createEAttribute(demandeEClass, DEMANDE__REFERENCE);
		createEAttribute(demandeEClass, DEMANDE__DATE_PLANIFIEE);
		createEAttribute(demandeEClass, DEMANDE__DESCRIPTION);
		createEReference(demandeEClass, DEMANDE__FORMULAIRE);
		createEReference(demandeEClass, DEMANDE__REPONSES);

		plateformeEClass = createEClass(PLATEFORME);
		createEReference(plateformeEClass, PLATEFORME__ASSOCIATIONS);
		createEAttribute(plateformeEClass, PLATEFORME__NOM);

		reponseEClass = createEClass(REPONSE);
		createEAttribute(reponseEClass, REPONSE__VALEUR);
		createEReference(reponseEClass, REPONSE__CHAMP);

		contenuCMSEClass = createEClass(CONTENU_CMS);
		createEAttribute(contenuCMSEClass, CONTENU_CMS__TITRE);
		createEAttribute(contenuCMSEClass, CONTENU_CMS__PUBLIE);
		createEAttribute(contenuCMSEClass, CONTENU_CMS__DATE_CREATION);
		createEAttribute(contenuCMSEClass, CONTENU_CMS__DATE_MODIFICATION);
		createEAttribute(contenuCMSEClass, CONTENU_CMS__SLUG);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__CONTENU);

		articleEClass = createEClass(ARTICLE);
		createEAttribute(articleEClass, ARTICLE__RESUME);
		createEAttribute(articleEClass, ARTICLE__DATE_PUBLICATION);
		createEAttribute(articleEClass, ARTICLE__CONTENU);
		createEReference(articleEClass, ARTICLE__AUTEUR);

		mediaEClass = createEClass(MEDIA);
		createEAttribute(mediaEClass, MEDIA__NOM);
		createEAttribute(mediaEClass, MEDIA__URL);
		createEAttribute(mediaEClass, MEDIA__DESCRIPTION);
		createEAttribute(mediaEClass, MEDIA__TYPE);

		// Create enums
		champTypeEEnum = createEEnum(CHAMP_TYPE);
		mediaTypeEEnum = createEEnum(MEDIA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		associationEClass.getESuperTypes().add(this.getEntite());
		utilisateurEClass.getESuperTypes().add(this.getEntite());
		roleEClass.getESuperTypes().add(this.getEntite());
		formulaireEClass.getESuperTypes().add(this.getEntite());
		champEClass.getESuperTypes().add(this.getEntite());
		demandeEClass.getESuperTypes().add(this.getEntite());
		reponseEClass.getESuperTypes().add(this.getEntite());
		pageEClass.getESuperTypes().add(this.getContenuCMS());
		articleEClass.getESuperTypes().add(this.getContenuCMS());

		// Initialize classes, features, and operations; add parameters
		initEClass(entiteEClass, Entite.class, "Entite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntite_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Entite.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntite_Actif(), ecorePackage.getEBoolean(), "actif", null, 1, 1, Entite.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_Email(), ecorePackage.getEString(), "email", null, 0, 1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_NumTel(), ecorePackage.getEString(), "numTel", null, 0, 1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Adresse(), ecorePackage.getEString(), "adresse", null, 0, 1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Formulaires(), this.getFormulaire(), this.getFormulaire_Association(),
				"formulaires", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Demandes(), this.getDemande(), null, "demandes", null, 0, -1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Utilisateurs(), this.getUtilisateur(), null, "utilisateurs", null, 0, -1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Roles(), this.getRole(), null, "roles", null, 0, -1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Pages(), this.getPage(), null, "pages", null, 0, -1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Articles(), this.getArticle(), null, "articles", null, 0, -1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Medias(), this.getMedia(), null, "medias", null, 0, -1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilisateurEClass, Utilisateur.class, "Utilisateur", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtilisateur_Email(), ecorePackage.getEString(), "email", null, 1, 1, Utilisateur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilisateur_NomComplet(), ecorePackage.getEString(), "nomComplet", null, 1, 1,
				Utilisateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUtilisateur_Role(), this.getRole(), null, "role", null, 1, 1, Utilisateur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formulaireEClass, Formulaire.class, "Formulaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormulaire_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Formulaire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Formulaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFormulaire_Champs(), this.getChamp(), null, "champs", null, 1, -1, Formulaire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormulaire_Association(), this.getAssociation(), this.getAssociation_Formulaires(),
				"association", null, 1, 1, Formulaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(champEClass, Champ.class, "Champ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChamp_Libelle(), ecorePackage.getEString(), "libelle", null, 1, 1, Champ.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChamp_Type(), this.getChampType(), "type", null, 1, 1, Champ.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChamp_Obligatoire(), ecorePackage.getEBoolean(), "obligatoire", null, 1, 1, Champ.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(demandeEClass, Demande.class, "Demande", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDemande_Reference(), ecorePackage.getEString(), "reference", null, 1, 1, Demande.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDemande_DatePlanifiee(), ecorePackage.getEDate(), "datePlanifiee", null, 0, 1, Demande.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDemande_Description(), ecorePackage.getEString(), "description", null, 0, 1, Demande.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemande_Formulaire(), this.getFormulaire(), null, "formulaire", null, 1, 1, Demande.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemande_Reponses(), this.getReponse(), null, "reponses", null, 0, -1, Demande.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plateformeEClass, Plateforme.class, "Plateforme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlateforme_Associations(), this.getAssociation(), null, "associations", null, 0, -1,
				Plateforme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlateforme_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Plateforme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reponseEClass, Reponse.class, "Reponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReponse_Valeur(), ecorePackage.getEString(), "valeur", null, 0, 1, Reponse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReponse_Champ(), this.getChamp(), null, "champ", null, 1, 1, Reponse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(contenuCMSEClass, ContenuCMS.class, "ContenuCMS", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenuCMS_Titre(), ecorePackage.getEString(), "titre", null, 1, 1, ContenuCMS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenuCMS_Publie(), ecorePackage.getEBoolean(), "publie", null, 1, 1, ContenuCMS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenuCMS_DateCreation(), ecorePackage.getEDate(), "dateCreation", null, 1, 1,
				ContenuCMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenuCMS_DateModification(), ecorePackage.getEDate(), "dateModification", null, 0, 1,
				ContenuCMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenuCMS_Slug(), ecorePackage.getEString(), "slug", null, 1, 1, ContenuCMS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Contenu(), ecorePackage.getEString(), "contenu", null, 1, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(articleEClass, Article.class, "Article", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArticle_Resume(), ecorePackage.getEString(), "resume", null, 0, 1, Article.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArticle_DatePublication(), ecorePackage.getEDate(), "datePublication", null, 1, 1,
				Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getArticle_Contenu(), ecorePackage.getEString(), "contenu", null, 1, 1, Article.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArticle_Auteur(), this.getUtilisateur(), null, "auteur", null, 0, 1, Article.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaEClass, Media.class, "Media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedia_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Media.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Url(), ecorePackage.getEString(), "url", null, 1, 1, Media.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Description(), ecorePackage.getEString(), "description", null, 0, 1, Media.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Type(), this.getMediaType(), "type", null, 1, 1, Media.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(champTypeEEnum, ChampType.class, "ChampType");
		addEEnumLiteral(champTypeEEnum, ChampType.TEXTAREA);
		addEEnumLiteral(champTypeEEnum, ChampType.TEXT);
		addEEnumLiteral(champTypeEEnum, ChampType.NUMBER);
		addEEnumLiteral(champTypeEEnum, ChampType.DATE);
		addEEnumLiteral(champTypeEEnum, ChampType.EMAIL);
		addEEnumLiteral(champTypeEEnum, ChampType.BOOLEAN);
		addEEnumLiteral(champTypeEEnum, ChampType.SELECT);
		addEEnumLiteral(champTypeEEnum, ChampType.RADIO);

		initEEnum(mediaTypeEEnum, MediaType.class, "MediaType");
		addEEnumLiteral(mediaTypeEEnum, MediaType.IMAGE);
		addEEnumLiteral(mediaTypeEEnum, MediaType.PDF);
		addEEnumLiteral(mediaTypeEEnum, MediaType.VIDEO);
		addEEnumLiteral(mediaTypeEEnum, MediaType.AUTRE);

		// Create resource
		createResource(eNS_URI);
	}

} //CmsassociationPackageImpl
