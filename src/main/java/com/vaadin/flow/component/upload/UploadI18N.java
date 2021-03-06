/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.component.upload;

import java.util.List;

/**
 * The I18N helper file for the upload component.
 */
public class UploadI18N {
    private DropFiles dropFiles;
    private AddFiles addFiles;
    private String cancel;
    private Error error;
    private Uploading uploading;
    private List<String> units;

    /**
     * Translations for dropping files.
     */
    public static class DropFiles extends SingleMulti {
        @Override
        public DropFiles setOne(String one) {
            super.setOne(one);
            return this;
        }

        @Override
        public DropFiles setMany(String many) {
            super.setMany(many);
            return this;
        }
    }

    /**
     * Translations for adding files.
     */
    public static class AddFiles extends SingleMulti {
        @Override
        public AddFiles setOne(String one) {
            super.setOne(one);
            return this;
        }

        @Override
        public AddFiles setMany(String many) {
            super.setMany(many);
            return this;
        }
    }

    /**
     * Exception translations.
     */
    public static class Error {
        private String tooManyFiles;
        private String fileIsTooBig;
        private String incorrectFileType;

        /**
         * Too many files translation.
         *
         * @return translation string or null if none set
         */
        public String getTooManyFiles() {
            return tooManyFiles;
        }

        /**
         * Set too many files error translation.
         *
         * @param tooManyFiles
         *         translation string
         * @return error translation class
         */
        public Error setTooManyFiles(String tooManyFiles) {
            this.tooManyFiles = tooManyFiles;
            return this;
        }

        /**
         * Get translation for file too big.
         *
         * @return translation string or null if none set
         */
        public String getFileIsTooBig() {
            return fileIsTooBig;
        }

        /**
         * Set file too big translation.
         *
         * @param fileIsTooBig
         *         translation string
         * @return error translation class
         */
        public Error setFileIsTooBig(String fileIsTooBig) {
            this.fileIsTooBig = fileIsTooBig;
            return this;

        }

        /**
         * Get translation for incorrect file type.
         *
         * @return translation string or null if none set
         */
        public String getIncorrectFileType() {
            return incorrectFileType;
        }

        /**
         * Set incorrect file type translation.
         *
         * @param incorrectFileType
         *         translation string
         * @return error translation class
         */
        public Error setIncorrectFileType(String incorrectFileType) {
            this.incorrectFileType = incorrectFileType;
            return this;
        }
    }

    /**
     * Upload time translation strings.
     */
    public static class Uploading {
        private Status status;
        private RemainingTime remainingTime;
        private Error error;

        /**
         * Get status translations.
         *
         * @return status translations
         */
        public Status getStatus() {
            return status;
        }

        /**
         * Set status translations.
         *
         * @param status
         *         status translations
         * @return uploading translations
         */
        public Uploading setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Get remaining time translations.
         *
         * @return remaining time translations
         */
        public RemainingTime getRemainingTime() {
            return remainingTime;
        }

        /**
         * Set remaining time translations.
         *
         * @param remainingTime
         *         remaining time translations
         * @return uploading translations
         */
        public Uploading setRemainingTime(RemainingTime remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }

        /**
         * Get upload error translations.
         *
         * @return error translations
         */
        public Error getError() {
            return error;
        }

        /**
         * Set upload error translations.
         *
         * @param error
         *         error translations
         * @return uploading translations
         */
        public Uploading setError(Error error) {
            this.error = error;
            return this;
        }

        /**
         * Upload status strings.
         */
        public static class Status {
            private String connecting;
            private String stalled;
            private String processing;
            private String held;

            /**
             * Get connecting translation.
             *
             * @return translation string
             */
            public String getConnecting() {
                return connecting;
            }

            /**
             * Set connecting translation.
             *
             * @param connecting
             *         translation string
             * @return status translations
             */
            public Status setConnecting(String connecting) {
                this.connecting = connecting;
                return this;
            }

            /**
             * Get stalled translation.
             *
             * @return translation string
             */
            public String getStalled() {
                return stalled;
            }

            /**
             * Set stalled translation.
             *
             * @param stalled
             *         translation string
             * @return status translations
             */
            public Status setStalled(String stalled) {
                this.stalled = stalled;
                return this;
            }

            /**
             * Get processing translation.
             *
             * @return translation string
             */
            public String getProcessing() {
                return processing;
            }

            /**
             * Set processing translation.
             *
             * @param processing
             *         translation string
             * @return status translations
             */
            public Status setProcessing(String processing) {
                this.processing = processing;
                return this;
            }

            /**
             * Get held translation.
             *
             * @return translation string
             */
            public String getHeld() {
                return held;
            }

            /**
             * Set held translation.
             *
             * @param held
             *         translation string
             * @return status translations
             */
            public Status setHeld(String held) {
                this.held = held;
                return this;
            }
        }

        /**
         * Time remaining translations.
         */
        public static class RemainingTime {
            private String prefix;
            private String unknown;

            /**
             * Get prefix translation.
             *
             * @return translation string
             */
            public String getPrefix() {
                return prefix;
            }

            /**
             * Set prefix translation.
             *
             * @param prefix
             *         translation string
             * @return remaining time translations
             */
            public RemainingTime setPrefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * Get unknown translation.
             *
             * @return translation string
             */
            public String getUnknown() {
                return unknown;
            }

            /**
             * Set unknown translation.
             *
             * @param unknown
             *         translation string
             * @return remaining time translations
             */
            public RemainingTime setUnknown(String unknown) {
                this.unknown = unknown;
                return this;
            }
        }

        /**
         * Communication error translations.
         */
        public static class Error {
            private String serverUnavailable;
            private String unexpectedServerError;
            private String forbidden;

            /**
             * @return translation string
             */
            public String getServerUnavailable() {
                return serverUnavailable;
            }

            /**
             * @param serverUnavailable
             *         translation string
             * @return
             */
            public Error setServerUnavailable(String serverUnavailable) {
                this.serverUnavailable = serverUnavailable;
                return this;
            }

            /**
             * @return translation string
             */
            public String getUnexpectedServerError() {
                return unexpectedServerError;
            }

            /**
             * @param unexpectedServerError
             *         translation string
             * @return
             */
            public Error setUnexpectedServerError(
                    String unexpectedServerError) {
                this.unexpectedServerError = unexpectedServerError;
                return this;
            }

            /**
             * @return translation string
             */
            public String getForbidden() {
                return forbidden;
            }

            /**
             * @param forbidden
             *         translation string
             * @return
             */
            public Error setForbidden(String forbidden) {
                this.forbidden = forbidden;
                return this;
            }
        }
    }

    /**
     * Abstract translation class for single and multi mode translations.
     */
    public static abstract class SingleMulti {
        private String one;
        private String many;

        /**
         * Get translation for single upload.
         *
         * @return translation string
         */
        public String getOne() {
            return one;
        }

        /**
         * Set translation for single upload.
         *
         * @param one
         *         translation string
         * @return translation class
         */
        public SingleMulti setOne(String one) {
            this.one = one;
            return this;
        }

        /**
         * @return translation string
         */
        public String getMany() {
            return many;
        }

        /**
         * @param many
         *         translation string
         * @return translation class
         */
        public SingleMulti setMany(String many) {
            this.many = many;
            return this;
        }
    }

    /**
     * Get drop translation.
     *
     * @return drop files translations
     */
    public DropFiles getDropFiles() {
        return dropFiles;
    }

    /**
     * Set drop translation.
     *
     * @param dropFiles
     *         drop files translations
     * @return i18n translations
     */
    public UploadI18N setDropFiles(DropFiles dropFiles) {
        this.dropFiles = dropFiles;
        return this;
    }

    /**
     * Get add files translations.
     *
     * @return add files translations
     */
    public AddFiles getAddFiles() {
        return addFiles;
    }

    /**
     * Set add files translations.
     *
     * @param addFiles
     *         add files translations
     * @return i18n translations
     */
    public UploadI18N setAddFiles(AddFiles addFiles) {
        this.addFiles = addFiles;
        return this;
    }

    /**
     * Get cancel translation.
     *
     * @return translation string
     */
    public String getCancel() {
        return cancel;
    }

    /**
     * Set cancel translation.
     *
     * @param cancel
     *         translation string
     * @return i18n translations
     */
    public UploadI18N setCancel(String cancel) {
        this.cancel = cancel;
        return this;
    }

    /**
     * Get error translations.
     *
     * @return error translations
     */
    public Error getError() {
        return error;
    }

    /**
     * Set error translations.
     *
     * @param error
     *         error translations
     * @return i18n translations
     */
    public UploadI18N setError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get uploading translations.
     *
     * @return uploading translations
     */
    public Uploading getUploading() {
        return uploading;
    }

    /**
     * Set uploading translations.
     *
     * @param uploading
     *         uploading translations
     * @return i18n translations
     */
    public UploadI18N setUploading(Uploading uploading) {
        this.uploading = uploading;
        return this;
    }

    /**
     * Get unit translations.
     *
     * @return list of unit translations
     */
    public List<String> getUnits() {
        return units;
    }

    /**
     * Set unit translations.
     *
     * @param units
     *         list of unit translations
     * @return i18n translations
     */
    public UploadI18N setUnits(List<String> units) {
        this.units = units;
        return this;
    }
}
