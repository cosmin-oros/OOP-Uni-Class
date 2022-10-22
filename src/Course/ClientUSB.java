package Course;

class Device {
    private String information;
    public Device() {
        information = "";
    }
    public Device(String information) {
        this.information = information;
    }
    public void store(String information) {
        this.information = information;
    }
    public String load() {
        return information;
    }
}

class PhotoDevice extends Device {
    public PhotoDevice(String information) {
        super(information);
    }
    public void takePicture() {
        System.out.println("TakePicture...");
    }
}

class VideoDevice extends Device{
    private String producer;
    public VideoDevice(String information, String producer) {
        super(information);
        this.producer = producer;
    }
    public void film() {
        System.out.println("Movie...");
    }
}

class PC {
    private String memory = "";
    private String registry;
    public void store(String information) {
        memory += information;
        registry = information;
    }
    public String load() {
        return registry;
    }
}

class USB{
    public void transferPCToDevice(PC pc, Device device) {
        String data;
        data = pc.load();
        device.store(data);
        System.out.println("PC -> Device " + data);
    }
    public void transferDeviceToPC(PC pc, Device device) {
        String data;
        data = device.load();
        pc.store(data);
        System.out.println("Device -> PC" + data);
    }
}

class ClientUSB {
    public static void main(String[] args) {
        Device photo, video;
        PC pc;
        USB usb;
        photo = new PhotoDevice("initialPhotoData");
        video = new VideoDevice("initialVideoData","company");
        pc = new PC();
        usb = new USB();
        usb.transferPCToDevice(pc, photo);
        usb.transferDeviceToPC(pc, video);
    }
}