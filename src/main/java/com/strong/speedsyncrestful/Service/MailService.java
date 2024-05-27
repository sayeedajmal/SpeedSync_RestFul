package com.strong.speedsyncrestful.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import com.strong.speedsyncrestful.Entity.Vehicle;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.NonNull;

/**
 * Service class for sending emails for various events in the Blood Donation
 * application.
 */
@Service
@EnableAsync
public class MailService {

  @Autowired
  private JavaMailSender emailSender;

  /**
   * Sends a MimeMessage email with the provided details.
   * 
   * @param to      the recipient email address
   * @param subject the subject of the email
   * @param text    the content of the email
   */
  @Async
  public void sendEmail(@NonNull String to, Vehicle vehicle) {
    try {
      MimeMessage message = emailSender.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(message, true);

      String email = to;
      String carNumber = vehicle.getCarNumber();
      String currentSpeed = vehicle.getCurrentSpeed() + " km/h";
      double latitude = vehicle.getLocation().getLatitude();
      double longitude = vehicle.getLocation().getLongitude();
      String currentLocation = String.valueOf(latitude + ":" + longitude);
      String challanPrice = "$" + 500;

      String htmlContent = String.format(
          """
              <!DOCTYPE html>
              <html lang="en">
              <head>
                  <meta charset="UTF-8">
                  <meta name="viewport" content="width=device-width, initial-scale=1.0">
                  <title>Challan Notification</title>
                  <style>
                      body {
                          font-family: Arial, sans-serif;
                      }
                      .container {
                          max-width: 600px;
                          margin: 0 auto;
                          padding: 20px;
                          border: 1px solid #ccc;
                          border-radius: 10px;
                          box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                      }
                      .header {
                          text-align: center;
                          margin-bottom: 20px;
                      }
                      .header h1 {
                          margin: 0;
                          font-size: 24px;
                          color: #333;
                      }
                      .content {
                          line-height: 1.6;
                      }
                      .content p {
                          margin: 10px 0;
                      }
                      .footer {
                          text-align: center;
                          margin-top: 20px;
                          font-size: 12px;
                          color: #777;
                      }
                  </style>
              </head>
              <body>
                  <div class="container">
                      <div class="header">
                          <h1>Challan Notification</h1>
                      </div>
                      <div class="content">
                          <p><strong>Email:</strong> %s</p>
                          <p><strong>Car Number:</strong> %s</p>
                          <p><strong>Current Speed:</strong> %s</p>
                          <p><strong>Current Location:</strong> %s</p>
                          <p><strong>Challan Price:</strong> %s</p>
                          <p>Dear Valued Driver,</p>
                          <p>We understand that the road can sometimes be unpredictable. However, ensuring everyone's safety is our top priority. Your recent speed exceeded the limit in a monitored area. Please take this as a gentle reminder to drive safely and adhere to speed regulations. Your attention to road safety not only protects you but also contributes to a safer community.</p>
                          <p>Thank you for your cooperation.</p>
                      </div>
                      <div class="footer">
                          <p>This is an automated notification. Please do not reply to this email.</p>
                      </div>
                  </div>
              </body>
              </html>
              """,
          email, carNumber, currentSpeed, currentLocation, challanPrice);

      helper.setTo(to);
      helper.setSubject("Challan Notification");
      helper.setText(htmlContent, true);

      emailSender.send(message);
    } catch (MessagingException e) {
      System.out.println("Failed to send email: " + e.getMessage());
    }
  }

}