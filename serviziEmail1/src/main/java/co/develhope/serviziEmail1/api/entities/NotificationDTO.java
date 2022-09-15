package co.develhope.serviziEmail1.api.entities;

import lombok.Data;

@Data
    public class NotificationDTO {

        /** User id to send data */
        private String studentId;
        /** Title of the notification */
        private String title;
        /** Text of the notification */
        private String text;


}

