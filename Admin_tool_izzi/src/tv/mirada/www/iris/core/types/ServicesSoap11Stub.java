/**
 * ServicesSoap11Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class ServicesSoap11Stub extends org.apache.axis.client.Stub implements tv.mirada.www.iris.core.types.Services {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveServiceFromPackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "RemoveServiceFromPackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">RemoveServiceFromPackageRequest"), tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "CreateServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">CreateServiceRequest"), tv.mirada.www.iris.core.service.messages.CreateServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">CreateServiceResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.service.messages.CreateServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "CreateServiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "ActivateServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">ActivateServiceRequest"), tv.mirada.www.iris.core.service.messages.ActivateServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "FindServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindServiceRequest"), tv.mirada.www.iris.core.service.messages.FindServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindServiceResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.service.messages.FindServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "FindServiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindServicesInPackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "FindServicesInPackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindServicesInPackageRequest"), tv.mirada.www.iris.core.service.messages.FindServicesInPackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindServicesInPackageResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.service.messages.FindServicesInPackageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "FindServicesInPackageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubscribeToPackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "SubscribeToPackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">SubscribeToPackageRequest"), tv.mirada.www.iris.core.service.messages.SubscribeToPackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">SubscribeToPackageResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "SubscribeToPackageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindPackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "FindPackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindPackageRequest"), tv.mirada.www.iris.core.service.messages.FindPackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindPackageResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.service.messages.FindPackageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "FindPackageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindPackagesContainingService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "FindPackagesContainingServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindPackagesContainingServiceRequest"), tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindPackagesContainingServiceResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "FindPackagesContainingServiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "CreatePackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">CreatePackageRequest"), tv.mirada.www.iris.core.service.messages.CreatePackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">CreatePackageResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.service.messages.CreatePackageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "CreatePackageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeletePackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "DeletePackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">DeletePackageRequest"), tv.mirada.www.iris.core.service.messages.DeletePackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddServiceToPackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "AddServiceToPackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">AddServiceToPackageRequest"), tv.mirada.www.iris.core.service.messages.AddServiceToPackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "DeleteServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">DeleteServiceRequest"), tv.mirada.www.iris.core.service.messages.DeleteServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnsubscribeFromAllPackages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "UnsubscribeFromAllPackagesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">UnsubscribeFromAllPackagesRequest"), tv.mirada.www.iris.core.service.messages.UnsubscribeFromAllPackagesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivatePackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "ActivatePackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">ActivatePackageRequest"), tv.mirada.www.iris.core.service.messages.ActivatePackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdatePackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "UpdatePackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">UpdatePackageRequest"), tv.mirada.www.iris.core.service.messages.UpdatePackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeactivatePackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "DeactivatePackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">DeactivatePackageRequest"), tv.mirada.www.iris.core.service.messages.DeactivatePackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeactivateService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "DeactivateServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">DeactivateServiceRequest"), tv.mirada.www.iris.core.service.messages.DeactivateServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnsubscribeFromPackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "UnsubscribeFromPackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">UnsubscribeFromPackageRequest"), tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", "UpdateServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">UpdateServiceRequest"), tv.mirada.www.iris.core.service.messages.UpdateServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

    }

    public ServicesSoap11Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServicesSoap11Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServicesSoap11Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">>AddServiceToPackageRequest>PackageId");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.AddServiceToPackageRequestPackageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">>AddServiceToPackageRequest>ServiceId");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.AddServiceToPackageRequestServiceId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">>RemoveServiceFromPackageRequest>PackageId");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequestPackageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">>RemoveServiceFromPackageRequest>ServiceId");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequestServiceId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">>UnsubscribeFromPackageRequest>SubscriberAndPackageId");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequestSubscriberAndPackageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">ActivatePackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.ActivatePackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">ActivateServiceRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.ActivateServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">AddServiceToPackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.AddServiceToPackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">CreatePackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.CreatePackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">CreatePackageResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.CreatePackageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">CreateServiceRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.CreateServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">CreateServiceResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.CreateServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">DeactivatePackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.DeactivatePackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">DeactivateServiceRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.DeactivateServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">DeletePackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.DeletePackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">DeleteServiceRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.DeleteServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindPackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.FindPackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindPackageResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.FindPackageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindPackagesContainingServiceRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindPackagesContainingServiceResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindServiceRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.FindServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindServiceResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.FindServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindServicesInPackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.FindServicesInPackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">FindServicesInPackageResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.FindServicesInPackageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">RemoveServiceFromPackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">SubscribeToPackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.SubscribeToPackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">SubscribeToPackageResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">UnsubscribeFromAllPackagesRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.UnsubscribeFromAllPackagesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">UnsubscribeFromPackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">UpdatePackageRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.UpdatePackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/service/messages", ">UpdateServiceRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.service.messages.UpdateServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ConditionalAccessId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipmentId");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.CustomerPremisesEquipmentId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "HardwareId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisId");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorBSSSubscriberId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorBSSSystem");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.OperatorSubscriberId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriptionId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Package");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types._package.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PackageId");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.PackageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "PackageSubscriberId");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.PackageSubscriberId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ProviderName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ProviderServiceId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Service");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ServiceDescription");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ServiceName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "ServiceProviderDetails");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.ServiceProviderDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "Subscription");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.Subscription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void removeServiceFromPackage(tv.mirada.www.iris.core.service.messages.RemoveServiceFromPackageRequest removeServiceFromPackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RemoveServiceFromPackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {removeServiceFromPackageRequest});

    }

    public tv.mirada.www.iris.core.service.messages.CreateServiceResponse createService(tv.mirada.www.iris.core.service.messages.CreateServiceRequest createServiceRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createServiceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.service.messages.CreateServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.service.messages.CreateServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.service.messages.CreateServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void activateService(tv.mirada.www.iris.core.service.messages.ActivateServiceRequest activateServiceRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ActivateService"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {activateServiceRequest});

    }

    public tv.mirada.www.iris.core.service.messages.FindServiceResponse findService(tv.mirada.www.iris.core.service.messages.FindServiceRequest findServiceRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {findServiceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.service.messages.FindServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.service.messages.FindServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.service.messages.FindServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public tv.mirada.www.iris.core.service.messages.FindServicesInPackageResponse findServicesInPackage(tv.mirada.www.iris.core.service.messages.FindServicesInPackageRequest findServicesInPackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindServicesInPackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {findServicesInPackageRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.service.messages.FindServicesInPackageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.service.messages.FindServicesInPackageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.service.messages.FindServicesInPackageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse subscribeToPackage(tv.mirada.www.iris.core.service.messages.SubscribeToPackageRequest subscribeToPackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubscribeToPackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subscribeToPackageRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.service.messages.SubscribeToPackageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public tv.mirada.www.iris.core.service.messages.FindPackageResponse findPackage(tv.mirada.www.iris.core.service.messages.FindPackageRequest findPackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindPackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {findPackageRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.service.messages.FindPackageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.service.messages.FindPackageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.service.messages.FindPackageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceResponse findPackagesContainingService(tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceRequest findPackagesContainingServiceRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindPackagesContainingService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {findPackagesContainingServiceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.service.messages.FindPackagesContainingServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public tv.mirada.www.iris.core.service.messages.CreatePackageResponse createPackage(tv.mirada.www.iris.core.service.messages.CreatePackageRequest createPackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreatePackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createPackageRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.service.messages.CreatePackageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.service.messages.CreatePackageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.service.messages.CreatePackageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deletePackage(tv.mirada.www.iris.core.service.messages.DeletePackageRequest deletePackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeletePackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {deletePackageRequest});

    }

    public void addServiceToPackage(tv.mirada.www.iris.core.service.messages.AddServiceToPackageRequest addServiceToPackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddServiceToPackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {addServiceToPackageRequest});

    }

    public void deleteService(tv.mirada.www.iris.core.service.messages.DeleteServiceRequest deleteServiceRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteService"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {deleteServiceRequest});

    }

    public void unsubscribeFromAllPackages(tv.mirada.www.iris.core.service.messages.UnsubscribeFromAllPackagesRequest unsubscribeFromAllPackagesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UnsubscribeFromAllPackages"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {unsubscribeFromAllPackagesRequest});

    }

    public void activatePackage(tv.mirada.www.iris.core.service.messages.ActivatePackageRequest activatePackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ActivatePackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {activatePackageRequest});

    }

    public void updatePackage(tv.mirada.www.iris.core.service.messages.UpdatePackageRequest updatePackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdatePackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {updatePackageRequest});

    }

    public void deactivatePackage(tv.mirada.www.iris.core.service.messages.DeactivatePackageRequest deactivatePackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeactivatePackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {deactivatePackageRequest});

    }

    public void deactivateService(tv.mirada.www.iris.core.service.messages.DeactivateServiceRequest deactivateServiceRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeactivateService"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {deactivateServiceRequest});

    }

    public void unsubscribeFromPackage(tv.mirada.www.iris.core.service.messages.UnsubscribeFromPackageRequest unsubscribeFromPackageRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UnsubscribeFromPackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {unsubscribeFromPackageRequest});

    }

    public void updateService(tv.mirada.www.iris.core.service.messages.UpdateServiceRequest updateServiceRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateService"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {updateServiceRequest});

    }

}
